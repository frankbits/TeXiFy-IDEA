package nl.hannahsten.texifyidea.completion.handlers

import com.intellij.codeInsight.completion.InsertHandler
import com.intellij.codeInsight.completion.InsertionContext
import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.codeInsight.template.Template
import com.intellij.codeInsight.template.TemplateEditingListener
import com.intellij.codeInsight.template.TemplateManager
import com.intellij.codeInsight.template.impl.TemplateImpl
import com.intellij.codeInsight.template.impl.TemplateState
import com.intellij.codeInsight.template.impl.TextExpression
import nl.hannahsten.texifyidea.lang.*
import nl.hannahsten.texifyidea.util.*
import nl.hannahsten.texifyidea.util.files.definitionsAndRedefinitionsInFileSet

/**
 * @author Hannah Schellekens, Sten Wessel
 */
class LatexNoMathInsertHandler(val arguments: List<Argument>? = null) : InsertHandler<LookupElement> {

    override fun handleInsert(context: InsertionContext, item: LookupElement) {
        val command = item.`object` as LatexCommand

        when (command.command) {
            LatexRegularCommand.BEGIN.command -> {
                insertBegin(context)
            }
            in Magic.Typography.pseudoCodeBeginEndOpposites -> {
                insertPseudocodeEnd(command.command, context)
            }
            else -> {
                LatexCommandArgumentInsertHandler(arguments).handleInsert(context, item)
            }
        }

        RightInsertHandler().handleInsert(context, item)
        LatexCommandPackageIncludeHandler().handleInsert(context, item)
    }

    private fun insertPseudocodeEnd(name: String, context: InsertionContext) {
        val numberRequiredArguments = LatexCommand.lookup(name)
            ?.firstOrNull()?.arguments
            ?.count { it is RequiredArgument } ?: 0

        val templateText = List(numberRequiredArguments) {
            "{\$__Variable${it}\$}"
        }.joinToString("") + "\n\$END\$\n\\${Magic.Typography.pseudoCodeBeginEndOpposites[name]}"
        val parameterTemplate = object : TemplateImpl("", templateText, "") {
            override fun isToReformat(): Boolean = false
        }
        repeat(numberRequiredArguments) { parameterTemplate.addVariable(TextExpression(""), true) }

        TemplateManager.getInstance(context.project)
            .startTemplate(context.editor, parameterTemplate)
    }

    /**
     * Inserts a live template to make the end command match the begin command.
     */
    private fun insertBegin(context: InsertionContext) {
        val templateText = "{\$__Variable0\$}\$END\$\n\\end{\$__Variable0\$}"
        val template = object : TemplateImpl("", templateText, "") {
            override fun isToReformat(): Boolean = true
        }
        template.addVariable(TextExpression(""), true)

        TemplateManager.getInstance(context.project)
            .startTemplate(context.editor, template, EnvironmentInsertImports(context))
    }

    /**
     * Insert a live template for the required arguments. When there are  no required
     * arguments, move to the content of the environment.
     */
    private fun insertRequiredArguments(environment: Environment?, context: InsertionContext) {
        val numberRequiredArguments = environment?.arguments
            ?.count { it is RequiredArgument } ?: 0

        val templateText = List(numberRequiredArguments) { "{\$__Variable${it}\$}" }.joinToString("") + "\n\$END\$"
        val parameterTemplate = object : TemplateImpl("", templateText, "") {
            override fun isToReformat(): Boolean = true
        }
        repeat(numberRequiredArguments) { parameterTemplate.addVariable(TextExpression(""), true) }

        TemplateManager.getInstance(context.project)
            .startTemplate(context.editor, parameterTemplate)
    }

    /**
     * Makes sure environments get imported if required.
     *
     * @author Hannah Schellekens
     */
    private inner class EnvironmentInsertImports(val context: InsertionContext) : TemplateEditingListener {

        override fun beforeTemplateFinished(templateState: TemplateState, template: Template?) {
            val envName = templateState.getVariableValue("__Variable0")?.text ?: return

            val environment = Environment[envName]
            insertRequiredArguments(environment, context)
            environment ?: return

            val pack = environment.dependency
            val file = context.file
            val editor = context.editor
            val envDefinitions = file.definitionsAndRedefinitionsInFileSet().asSequence()
                .filter { it.isEnvironmentDefinition() }
                .mapNotNull { it.requiredParameter(0) }
                .toSet()

            // Include packages.
            if (!file.includedPackages().contains(pack.name) && envName !in envDefinitions) {
                file.insertUsepackage(pack)
            }

            // Add initial contents.
            val initial = environment.initialContents
            editor.insertAndMove(editor.caretModel.offset, initial)
        }

        override fun templateFinished(template: Template, b: Boolean) {}
        override fun templateCancelled(template: Template?) {}
        override fun currentVariableChanged(templateState: TemplateState, template: Template?, i: Int, i1: Int) {}
        override fun waitingForInput(template: Template?) {}
    }
}

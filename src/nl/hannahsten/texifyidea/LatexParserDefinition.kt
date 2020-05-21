package nl.hannahsten.texifyidea

import com.intellij.lang.ASTNode
import com.intellij.lang.Language
import com.intellij.lang.ParserDefinition
import com.intellij.lang.ParserDefinition.SpaceRequirements
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.stubs.PsiFileStubImpl
import com.intellij.psi.tree.IStubFileElementType
import com.intellij.psi.tree.TokenSet
import nl.hannahsten.texifyidea.file.LatexFile
import nl.hannahsten.texifyidea.parser.LatexParser
import nl.hannahsten.texifyidea.psi.LatexTypes

/**
 * @author Sten Wessel
 */
class LatexParserDefinition : ParserDefinition {
    override fun createLexer(project: Project): Lexer {
        return LatexLexerAdapter()
    }

    override fun createParser(project: Project): PsiParser {
        return LatexParser()
    }

    override fun getFileNodeType(): IStubFileElementType<*> {
        return FILE
    }

    override fun getWhitespaceTokens(): TokenSet {
        return WHITE_SPACES
    }

    override fun getCommentTokens(): TokenSet {
        return COMMENTS
    }

    override fun getStringLiteralElements(): TokenSet {
        return NORMAL_TEXT
    }

    override fun createElement(node: ASTNode): PsiElement {
        return LatexTypes.Factory.createElement(node)
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return LatexFile(viewProvider)
    }

    override fun spaceExistenceTypeBetweenTokens(
        left: ASTNode,
        right: ASTNode
    ): SpaceRequirements {
        return SpaceRequirements.MAY
    }

    companion object {
        val WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE)
        val COMMENTS = TokenSet.create(LatexTypes.COMMENT_TOKEN)
        val NORMAL_TEXT = TokenSet.create(LatexTypes.NORMAL_TEXT)
        val FILE: IStubFileElementType<*> = object : IStubFileElementType<LatexFileStub>(
            Language.findInstance(LatexLanguage::class.java)
        ) {
            override fun getStubVersion(): Int {
                return 6
            }
        }
    }

    class LatexFileStub(file: LatexFile) : PsiFileStubImpl<LatexFile>(file)
}
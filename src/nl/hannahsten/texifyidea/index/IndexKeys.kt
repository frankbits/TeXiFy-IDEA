package nl.hannahsten.texifyidea.index

import com.intellij.psi.stubs.StubIndexKey
import nl.hannahsten.texifyidea.psi.LatexCommands
import nl.hannahsten.texifyidea.psi.LatexEnvironment

/**
 * @author Hannah Schellekens
 */
object IndexKeys {
    val COMMANDS_KEY =
        StubIndexKey.createIndexKey<String, LatexCommands>("nl.hannahsten.texifyidea.commands")
    val INCLUDES_KEY =
        StubIndexKey.createIndexKey<String, LatexCommands>("nl.hannahsten.texifyidea.includes")
    val DEFINITIONS_KEY =
        StubIndexKey.createIndexKey<String, LatexCommands>("nl.hannahsten.texifyidea.definitions")
    val ENVIRONMENTS_KEY =
        StubIndexKey.createIndexKey<String, LatexEnvironment>("nl.hannahsten.texifyidea.environments")
    val LABELED_ENVIRONMENTS_KEY =
        StubIndexKey.createIndexKey<String, LatexEnvironment>("nl.hannahsten.texifyidea.parameterlabeledenvironments")
}
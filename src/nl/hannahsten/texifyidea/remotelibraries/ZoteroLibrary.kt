package nl.hannahsten.texifyidea.remotelibraries

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import nl.hannahsten.texifyidea.util.createCredentialsAttributes

class ZoteroLibrary(private val userID: String = Temp.userID, private val userApiKey: String = Temp.userApiKey) : RemoteBibLibrary(NAME) {

    private val client by lazy { HttpClient(CIO) }

    override suspend fun getBibtexString(): String {
        return client.get("https://api.zotero.org/users/$userID/items") {
            headers {
                append("Zotero-API-version", VERSION.toString())
                append("Zotero-API-key", userApiKey)
            }
            parameter("format", "bibtex")
        }.body()
    }

    companion object {

        const val VERSION = 3
        const val NAME = "Zotero"
        val credentialAttributes = createCredentialsAttributes(NAME)
    }
}
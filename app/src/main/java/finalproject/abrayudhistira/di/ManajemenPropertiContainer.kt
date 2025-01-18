package finalproject.abrayudhistira.di

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import finalproject.abrayudhistira.service.PropertiService
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

interface AppContainer {

}

class ManajemenPropertiContainer : AppContainer {
    private val baseUrl = "https://icoass.com/apiforpam/"
    private val json = Json { ignoreUnknownKeys = true}
    private val retrofit: Retrofit = Retrofit.Builder()

        .addConverterFactory(json.asConverterFactory("application/json".toMediaType()))
        .baseUrl(baseUrl)
        .build()
    private val propertiService : PropertiService by lazy {
        retrofit.create(PropertiService::class.java)
    }
}
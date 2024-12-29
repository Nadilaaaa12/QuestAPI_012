package com.example.pertemuan12.di

import com.example.pertemuan12.repository.MahasiswaRepository
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.example.pertemuan12.repository.NetworkKontakRepository
import com.example.pertemuan12.service_api.MahasiswaService
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

interface AppContainer{
    val kontakRepository: MahasiswaRepository
}

class MahasiswaContainer: AppContainer{
    private val baseUrl = "http://10.0.2.2:8000/umyTI/"
    private val json = Json { ignoreUnknownKeys = true }

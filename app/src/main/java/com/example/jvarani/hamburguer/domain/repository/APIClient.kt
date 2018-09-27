package com.example.jvarani.hamburguer.domain.repository

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class APIClient {
    private val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("http://192.168.15.6:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    fun getApiClient(): IRest {
        return retrofit.create(IRest::class.java)
    }
}
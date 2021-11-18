package com.faircorp.model

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class ApiServices {
    val windowsApiService : WindowApiService by lazy {
        Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl("https://dev-mind.fr/training/android/")//https://liwei-xu.cleverapps.io/
            .build()
            .create(WindowApiService::class.java)
    }
}

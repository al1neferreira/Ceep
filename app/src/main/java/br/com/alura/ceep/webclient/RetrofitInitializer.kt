package br.com.alura.ceep.webclient

import br.com.alura.ceep.service.NotesService
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


class RetrofitInitializer {

    var retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://http://localhost:8080/")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    val notesService = retrofit.create(NotesService::class.java)
}
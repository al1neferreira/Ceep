package br.com.alura.ceep.webclient

import retrofit2.Retrofit



class RetrofitInitializer {

    var retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://http://localhost:8080/")
        .build()
}
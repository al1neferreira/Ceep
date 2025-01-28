package br.com.alura.ceep.service

import br.com.alura.ceep.model.Nota
import retrofit2.Call
import retrofit2.http.GET

interface NotesService {

    @GET("notas")
    fun buscaNotas(): Call<List<Nota>>
}
package com.app.compose_navigation_mvvm_flow.data.remote

import com.app.compose_navigation_mvvm_flow.data.Receipes
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("recipes")
    suspend fun getReceipes(): Response<Receipes>

    @GET("recipes/{id}")
    suspend fun getReceipeDetails(@Path("id")id:Int?): Response<Receipes.Recipe>
}
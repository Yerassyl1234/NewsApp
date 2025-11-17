package com.example.newsapp.data.remote


import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {


    @GET("v2/everything?apiKey=0a0659586e48482fbcf21775d32ea83b")

    suspend fun loadArticles(
       @Query("q") topic: String
    ): NewsResponseDto
}
package com.example.easyfood.data.api
import com.example.easyfood.BuildConfig
import com.example.easyfood.data.entity.NewsResponse
import retrofit2.Response

import retrofit2.http.GET

import retrofit2.http.Query

//
interface ApiService {
    @GET("v2/top-headlines")
    fun getNewsHeadlines(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String = BuildConfig.NEWS_API_KEY,
    ) : Response<NewsResponse>
}

//https://newsapi.org/v2/everything?q=bitcoin&apiKey=
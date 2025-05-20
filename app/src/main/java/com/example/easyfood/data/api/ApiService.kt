package com.example.easyfood.data.api
import com.example.easyfood.BuildConfig

import retrofit2.http.Query

//
interface ApiService {

    fun getNewsHeadlines(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String = BuildConfig.NEWS_API_KEY,
    )
}

//https://newsapi.org/v2/everything?q=bitcoin&apiKey=8a19cd0880944180af72ad19b0eccfb4
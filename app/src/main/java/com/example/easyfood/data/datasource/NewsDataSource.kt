package com.example.easyfood.data.datasource

import com.example.easyfood.BuildConfig
import com.example.easyfood.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.Query

// This interface defines the contract for the News data source.
interface NewsDataSource {
   suspend fun getNewsHeadlines(
       country: String,
    ) : Response<NewsResponse>

}
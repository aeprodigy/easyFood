package com.example.easyfood.ui.theme.repository

import com.example.easyfood.data.datasource.NewsDataSource
import com.example.easyfood.data.entity.NewsResponse
import retrofit2.Response
import javax.inject.Inject

class NewsRepository @Inject constructor(
    private val newsDataSource: NewsDataSource
) {
    suspend fun getNewsHeadlines(country: String) : Response<NewsResponse> {

        return newsDataSource.getNewsHeadlines(country)
        "1.00.36 - 1.58.36"
    }
}
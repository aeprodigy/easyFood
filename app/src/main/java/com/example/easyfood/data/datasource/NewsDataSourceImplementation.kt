package com.example.easyfood.data.datasource

import com.example.easyfood.data.api.ApiService
import com.example.easyfood.data.entity.NewsResponse
import retrofit2.Response
import javax.inject.Inject

class NewsDataSourceImplementation @Inject constructor(
    private val apiService: ApiService
): NewsDataSource {

    override suspend  fun getNewsHeadlines(
        country: String,
    ) : Response<NewsResponse>{
        return apiService.getNewsHeadlines(country)
    }

}
package com.example.easyfood.data.depinject

import com.example.easyfood.data.api.ApiService
import com.example.easyfood.data.constant.BaseUrl
import com.example.easyfood.data.datasource.NewsDataSourceImplementation
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun providesRetrofit() : Retrofit{

        // Create a logging interceptor
        val httpLoggingInterceptor = HttpLoggingInterceptor().apply{
            level = HttpLoggingInterceptor.Level.BODY
        }
        // Create an OkHttpClient and add the logging interceptor
        val okHttpClient = OkHttpClient().newBuilder().apply {
            addInterceptor(httpLoggingInterceptor)
        }
        //time out
        okHttpClient.apply {
            readTimeout(60, TimeUnit.SECONDS)
        }
        //moshi
        val moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()

        return Retrofit.Builder().baseUrl(
           BaseUrl.baseUrl
        ).client(okHttpClient.build())
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
    }

    //apiservice
    @Singleton
    @Provides
    fun providesApiService(retrofit: Retrofit) : ApiService {
        return retrofit.create(ApiService::class.java)
    }

    //provides news data source
    @Singleton
    @Provides
    fun providesNewsDataSource(apiService: ApiService) : com.example.easyfood.data.datasource.NewsDataSource {
        return NewsDataSourceImplementation(apiService)
    }

}
package com.example.easyfood.data.depinject

import com.example.easyfood.data.constant.BaseUrl
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
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

}
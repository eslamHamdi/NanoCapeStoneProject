package com.example.mynews.api

import com.example.mynews.dto.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Service {


    @GET("top-headlines")
    suspend fun getHeadLines(@Query("country") country:String, @Query("page")
    pageNumber: Int = 1):Response<NewsResponse>

    @GET("top-headlines")
    suspend fun getByCatagory(@Query("country") country:String, @Query("page")
    pageNumber: Int = 1,@Query("category") category:String):Response<NewsResponse>

    @GET("everything")
    suspend fun searchForNews(
        @Query("q")
        searchQuery: String,
        @Query("page")
        pageNumber: Int = 1):Response<NewsResponse>
}
package com.example.basedeneme.services

import com.example.basedeneme.model.Users
import com.example.basedeneme.model.UsersItem
import retrofit2.Response

import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("/SharminSirajudeen/test_resources/users")
    suspend fun getUsers(): Response<Users>

    @GET("SharminSirajudeen/test_resources/users")
    suspend fun getPost(@Query("id") id:Int): UsersItem

}
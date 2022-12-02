package com.example.basedeneme.services

import com.example.basedeneme.model.PostsItemResponse
import com.example.basedeneme.model.UsersResponse
import retrofit2.Response

import retrofit2.http.GET
import retrofit2.http.Path

interface Api {

    @GET("SharminSirajudeen/test_resources/users")
    suspend fun getUsers(): Response<UsersResponse>

    @GET("SharminSirajudeen/test_resources/posts/{id}")
    suspend fun getPosts(
       @Path("id") id:Int
    ): Response<PostsItemResponse>
}
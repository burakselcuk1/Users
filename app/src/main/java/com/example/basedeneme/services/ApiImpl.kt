package com.example.basedeneme.services

import javax.inject.Inject

class ApiImpl @Inject constructor(private val api: Api) {

    suspend fun getUsers() = api.getUsers()
    //suspend fun getPosts()=api.getPost(id : Int)


}
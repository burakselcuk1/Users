package com.example.basedeneme.repository

import com.example.basedeneme.common.handleRequestFlow
import com.example.basedeneme.services.ApiImpl
import javax.inject.Inject


class UserRepository @Inject constructor(private val usersApiImple: ApiImpl) {

    suspend fun getUsers() =  handleRequestFlow { usersApiImple.getUsers() }
    suspend fun getPosts(id: Int) = usersApiImple.getPosts(id)

}
package com.example.basedeneme.repository

import com.example.basedeneme.services.ApiImpl
import javax.inject.Inject


class UserRepository @Inject constructor(private val usersApiImple: ApiImpl) {

    suspend fun getUsers() = usersApiImple.getUsers()

}
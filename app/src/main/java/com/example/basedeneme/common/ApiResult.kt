package com.example.basedeneme.common

sealed class ApiResult <out T> {
    data class success<out R>(val data: R?): ApiResult<R>()

    data class error(val message: String): ApiResult<Nothing>()

    object loading: ApiResult<Nothing>()
}
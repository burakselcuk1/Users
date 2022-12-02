package com.example.basedeneme.utils

import com.example.basedeneme.model.UsersResponse


sealed class DataFetchResult {
    object Loading : DataFetchResult()
    class Failure(val msg:String) : DataFetchResult()
    class Success(val data: UsersResponse) : DataFetchResult()
    object Empty : DataFetchResult()
}
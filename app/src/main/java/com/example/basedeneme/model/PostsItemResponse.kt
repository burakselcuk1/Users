package com.example.basedeneme.model

import com.google.gson.annotations.SerializedName


data class PostsItemResponse(
    val body: String,
    @SerializedName("id")
    val id: Int,
    val title: String,
    val userId: Int
)
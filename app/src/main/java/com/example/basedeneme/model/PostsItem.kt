package com.example.basedeneme.model

import com.google.gson.annotations.SerializedName


data class PostsItem(
    val body: String,
    @SerializedName("id")
    val id: Int,
    val title: String,
    val userId: Int
)
package com.example.laba_11_15.data.posts.model.responses

import kotlinx.serialization.Serializable

@Serializable
internal data class Posts(
    val limit: Int,
    val posts: List<Post>,
    val skip: Int,
    val total: Int
)
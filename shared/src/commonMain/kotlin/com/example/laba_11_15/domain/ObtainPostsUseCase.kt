package com.example.laba_11_15.domain

import com.example.laba_11_15.data.common.Result
import com.example.laba_11_15.data.posts.model.responses.Posts
import com.example.laba_11_15.domain.posts.PostRepository

internal class ObtainPostsUseCase(
    private val postRepository: PostRepository
) {
    suspend operator fun invoke(): Result<Posts> {
        return postRepository.getAllPosts()
    }
}
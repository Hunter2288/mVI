package com.example.laba_11_15.domain

import com.example.laba_11_15.data.common.Result
import com.example.laba_11_15.data.posts.model.requests.NewPost
import com.example.laba_11_15.domain.posts.PostRepository

internal class CreatePostUseCase (
    private val postRepository: PostRepository
) {
    suspend operator fun invoke(post: NewPost): Result<String> {
        return postRepository.addPost(post)
    }
}
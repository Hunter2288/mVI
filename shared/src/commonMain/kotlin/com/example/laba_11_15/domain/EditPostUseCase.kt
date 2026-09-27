package com.example.laba_11_15.domain

import com.example.laba_11_15.data.common.Result
import com.example.laba_11_15.data.posts.model.responses.Post
import com.example.laba_11_15.domain.posts.PostRepository

internal class EditPostUseCase(
    private val postRepository: PostRepository
) {
    suspend operator fun invoke(post: Post): Result<String> {
        return postRepository.updatePost(post)
    }
}
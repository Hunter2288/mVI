package com.example.laba_11_15.domain

import com.example.laba_11_15.data.common.Result
import com.example.laba_11_15.domain.posts.PostRepository

internal class RemovePostUseCase(
    private val postRepository: PostRepository
) {
    suspend operator fun invoke(postId: Int): Result<String> {
        return postRepository.deletePost(postId)
    }
}
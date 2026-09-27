package com.example.laba_11_15.domain.posts

import com.example.laba_11_15.data.common.Result
import com.example.laba_11_15.data.posts.model.requests.NewPost
import com.example.laba_11_15.data.posts.model.responses.DeletedPost
import com.example.laba_11_15.data.posts.model.responses.Post
import com.example.laba_11_15.data.posts.model.responses.Posts

internal interface PostRepository {
    suspend fun getAllPosts(): Result<Posts>
    suspend fun addPost(post: NewPost): Result<String>
    suspend fun updatePost(post: Post): Result<String>
    suspend fun deletePost(postId: Int): Result<String>
}
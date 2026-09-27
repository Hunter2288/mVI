package com.example.laba_11_15.presentation

import androidx.compose.runtime.Immutable
import com.example.laba_11_15.data.posts.model.responses.Post


@Immutable
internal data class AppState(
    val isProgressVisible: Boolean = false,
    val posts: List<Post> = emptyList(),
    val result: String? = null,
    val error: String? = null,
)
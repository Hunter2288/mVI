package com.example.laba_11_15.di

import com.example.laba_11_15.data.posts.AppPostApiService
import com.example.laba_11_15.data.posts.AppPostRepository
import com.example.laba_11_15.data.posts.PostApiService
import com.example.laba_11_15.domain.CreatePostUseCase
import com.example.laba_11_15.domain.EditPostUseCase
import com.example.laba_11_15.domain.ObtainPostsUseCase
import com.example.laba_11_15.domain.RemovePostUseCase
import com.example.laba_11_15.domain.posts.PostRepository
import com.example.laba_11_15.presentation.AppViewModel
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val networkModule = module {
    // 💡 ДОДАНО single { ... }, щоб зареєструвати HttpClient у Koin
    single {
        HttpClient {
            install(Logging) {
                level = LogLevel.ALL
                logger = object : Logger {
                    override fun log(message: String) {
                        println("KtorLogger: $message")
                    }
                }
            }
            install(ContentNegotiation) {
                json(Json {
                    prettyPrint = true
                    isLenient = true
                    ignoreUnknownKeys = true
                })
            }
        }
    }
    singleOf(::AppPostApiService) { bind<PostApiService>() }
}

val appModule = module {
    includes(networkModule)
    singleOf(::AppPostRepository) { bind<PostRepository>() }
    factoryOf(::CreatePostUseCase)
    factoryOf(::EditPostUseCase)
    factoryOf(::ObtainPostsUseCase)
    factoryOf(::RemovePostUseCase)
    viewModelOf(::AppViewModel)
}
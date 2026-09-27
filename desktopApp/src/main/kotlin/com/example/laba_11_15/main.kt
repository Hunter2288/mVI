package com.example.laba_11_15

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.example.laba_11_15.di.initKoin
import com.example.laba_11_15.presentation.App

fun main() = application {
    initKoin { printLogger() }
    Window(
        onCloseRequest = ::exitApplication,
        title = "Laba_1115",
    ) {
        App()
    }
}
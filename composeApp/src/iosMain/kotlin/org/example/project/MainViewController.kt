package org.example.project

import androidx.compose.ui.window.ComposeUIViewController
import org.example.project.di.appModule
import org.koin.core.context.startKoin

fun MainViewController() = ComposeUIViewController { App() }

fun initKoin() {
    // Initialize dependency injection
    startKoin {

        modules(appModule())
    }.koin
}
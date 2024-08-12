package org.example.project

import android.app.Application
import org.example.project.di.appModule
import org.koin.core.context.startKoin
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Inicializar Koin
        startKoin {
            androidContext(this@MainApplication)
            modules(appModule())
        }
    }
}
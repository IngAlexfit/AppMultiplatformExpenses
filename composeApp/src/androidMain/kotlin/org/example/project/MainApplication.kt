package org.example.project

import android.app.Application
import com.expenseApp.db.AppDatabase
import org.example.project.data.DatabaseDriverFactory
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
            modules(appModule(AppDatabase.invoke(DatabaseDriverFactory(this@MainApplication).createDriver())))
        }
    }
}
package org.example.project.di

import com.expenseApp.db.AppDatabase
import org.example.project.data.ExpenseRepoImpl
import org.example.project.domain.ExpenseRepository
import org.example.project.presentacion.ExpensesViewModel
import org.koin.dsl.module


fun appModule(appDatabase: AppDatabase) = module {
    single<ExpenseRepository> { ExpenseRepoImpl(appDatabase) }
    factory { ExpensesViewModel(get()) }
}
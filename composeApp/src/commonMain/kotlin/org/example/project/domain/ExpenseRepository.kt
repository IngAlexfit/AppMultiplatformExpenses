package org.example.project.domain

import org.example.project.model.Expense
import org.example.project.model.ExpenseCategory

interface ExpenseRepository {

    fun getAllExpenses(): List<Expense>

    fun addExpense(expense: Expense)

    fun editExpense(expense: Expense)

    fun getCategories(): List<ExpenseCategory>

    fun deleteExpense(expense: Expense): List<Expense>
}
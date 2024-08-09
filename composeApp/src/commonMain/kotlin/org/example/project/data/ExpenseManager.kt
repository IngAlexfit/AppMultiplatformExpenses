package org.example.project.data

import org.example.project.model.Expense
import org.example.project.model.ExpenseCategory

object ExpenseManager {
    private var currentId= 1L

    val fakeExpenseList = mutableListOf(
        Expense(
            id = currentId++,
            amount = 10.0,
            category = ExpenseCategory.GROCERIES,
            description = "Groceries"
        ),
        Expense(
            id = currentId++,
            amount = 20.0,
            category = ExpenseCategory.PARTY,
            description = "Party"
        ),
        Expense(
            id = currentId++,
            amount = 5.0,
            category = ExpenseCategory.SNACKS,
            description = "Snacks"
        ),
        Expense(
            id = currentId++,
            amount = 3.0,
            category = ExpenseCategory.COFFEE,
            description = "Coffee"
        ),
        Expense(
            id = currentId++,
            amount = 50.0,
            category = ExpenseCategory.CAR,
            description = "Car"
        ),
        Expense(
            id = currentId++,
            amount = 100.0,
            category = ExpenseCategory.HOUSEHOLD,
            description = "Household"
        ),
        Expense(
            id = currentId++,
            amount = 10.0,
            category = ExpenseCategory.OTHER,
            description = "Other"
        )
    )

    fun addNewExpense(expense: Expense){
        fakeExpenseList.add(expense.copy(id = currentId++))
    }

    fun editExpense(expense: Expense){
        val index = fakeExpenseList.indexOfFirst {
            it.id == expense.id
        }
        if(index != -1){
            fakeExpenseList[index] = fakeExpenseList[index].copy(
                amount = expense.amount,
                category = expense.category,
                description = expense.description
            )
        }
    }

    fun deleteExpense(expense: Expense){
        val index = fakeExpenseList.indexOfFirst {
            it.id == expense.id
        }

        fakeExpenseList.removeAt(index)

    }

    fun getCategories(): List<ExpenseCategory> {

        return listOf(
            ExpenseCategory.GROCERIES,
            ExpenseCategory.PARTY,
            ExpenseCategory.SNACKS,
            ExpenseCategory.COFFEE,
            ExpenseCategory.CAR,
            ExpenseCategory.HOUSEHOLD,
            ExpenseCategory.OTHER
        )
    }
}
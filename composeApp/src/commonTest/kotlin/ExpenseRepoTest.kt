import org.example.project.data.ExpenseManager
import org.example.project.data.ExpenseRepoImpl
import org.example.project.model.Expense
import org.example.project.model.ExpenseCategory
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class ExpenseRepoTest {
    private val expenseManager = ExpenseManager
    private val repo = ExpenseRepoImpl(expenseManager)

    @Test
    fun expense_list_is_not_empty() {
        //Given - Dado
        val expenseList = mutableListOf<Expense>()

        // When - Cuando
        expenseList.addAll(repo.getAllExpenses())
        // Then - Entonces
        assertTrue(expenseList.isNotEmpty())
    }

    @Test
    fun add_new_expense() {
        //Given - Dado
        val expenseList = repo.getAllExpenses()

        // When - Cuando
        repo.addExpense(
            Expense(
                amount = 4.5,
                category = ExpenseCategory.CAR,
                description = "Check"
            )
        )

        // Then - Entonces
        assertContains(expenseList, expenseList.find { it.id == 7L })
    }

    @Test
    fun edit_expense() {
        //Given - Dado
        val expenseListBefore = repo.getAllExpenses()

        // When - Cuando
        val newExpenseId = 7L
        repo.addExpense(
            Expense(
                amount = 4.5,
                category = ExpenseCategory.CAR,
                description = "Check"
            )
        )

        assertNotNull(expenseListBefore.find { it.id == newExpenseId })

        val updatedExpense = Expense(
            id = newExpenseId,
            amount = 10.0,
            category = ExpenseCategory.GROCERIES,
            description = "Test"
        )
        repo.editExpense(updatedExpense)

        // Then - Entonces
        val expenseListAfter = repo.getAllExpenses()
        assertEquals(updatedExpense, expenseListAfter.find { it.id == newExpenseId })
    }

    @Test
    fun get_all_categories(){
        //Given - Dado
        val categoryList = mutableListOf<ExpenseCategory>()

        // When - Cuando
        categoryList.addAll(repo.getCategories())

        // Then - Entonces
        assertTrue(categoryList.isNotEmpty())

    }

    @Test
    fun check_all_categories(){
        //Given - Dado
        val allCategories = listOf(
            ExpenseCategory.GROCERIES,
            ExpenseCategory.PARTY,
            ExpenseCategory.SNACKS,
            ExpenseCategory.COFFEE,
            ExpenseCategory.CAR,
            ExpenseCategory.HOUSEHOLD,
            ExpenseCategory.OTHER
        )
        // When - Cuando
        val repoCategories = repo.getCategories()

        // Then - Entonces
        assertEquals(allCategories, repoCategories)

    }
}
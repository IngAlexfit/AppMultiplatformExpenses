import org.example.project.model.Expense
import org.example.project.model.ExpenseCategory
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class ExampleTest {

    @Test
    fun sum_must_succedd() {
        //Given - Dado
        val x =5
        val y = 10
        // When - Cuando
        val result = x + y

        // Then - Entonces
        assertEquals(15, result)
    }

    @Test
    fun sum_must_fail() {
        //Given - Dado
        val x =5
        val y = 10
        // When - Cuando
        val result = x + y

        // Then - Entonces
        assertNotEquals(16, result)
    }

    @Test
    fun expense_model_list_test_add() {
        //Given - Dado
        val expenseList= mutableListOf<Expense>()
        val expense = Expense(id=1, amount = 10.0,  category = ExpenseCategory.GROCERIES, description = "Test")

        // When - Cuando
        expenseList.add(expense)

        // Then - Entonces
        assertContains(expenseList, expense)
    }

    @Test
    fun expense_model_param_test_succed() {
        //Given - Dado
        val expenseList= mutableListOf<Expense>()
        val expense = Expense(id=1, amount = 10.0,  category = ExpenseCategory.GROCERIES, description = "Test")
        val expense2 = Expense(id=5, amount = 45.0,  category = ExpenseCategory.GROCERIES, description = "expesnse3cdce")

        // When - Cuando
        expenseList.add(expense)
        expenseList.add(expense2)
        // Then - Entonces
        assertEquals(expenseList[0].category, expenseList[1].category)
    }

}
package section5

/*
 * Function Pipelines in Kotlin
 * Function pipelines allow chaining multiple functions to process data step-by-step in a clean and readable manner.
 * Each function in the pipeline performs a specific task, passing the result to the next function.
 */

data class Transaction(val id: Int, val amount: Double, val category: String)

val transactions = listOf(
    Transaction(1, 500.0, "Food"),
    Transaction(2, 1500.0, "Electronics"),
    Transaction(3, 250.0, "Food"),
    Transaction(4, 3000.0, "Electronics")
)

fun main() {
    val processedTransactions = transactions
        .filter { it.amount > 300 }
        .map { it.copy(amount = it.amount * 1.1) }
        .filter { it.category == "Electronics" }
        .sortedByDescending { it.amount }

    println("Processed Transactions: $processedTransactions")
}

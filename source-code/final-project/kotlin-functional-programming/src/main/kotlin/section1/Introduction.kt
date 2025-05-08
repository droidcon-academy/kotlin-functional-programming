package section1

/*
 * Quick Intro:
 * There are generally two styles of writing code—
 * 1. The Object-Oriented approach
 * 2. The Functional approach
 *
 * Below, you’ll find a simple example of both.
 * In this course, we'll mainly focus on writing code the functional way,
 * exploring how it works and why it matters.
 */


// Object-Oriented Style
class BankAccount(var balance: Int) {
    fun deposit(amount: Int) {
        balance += amount
    }

    fun withdraw(amount: Int) {
        balance -= amount
    }
}

// Functional Style
fun deposit(balance: Int, amount: Int) = balance + amount
fun withdraw(balance: Int, amount: Int) = balance - amount


fun main() {
    val account = BankAccount(1000)
    account.deposit(500)
    account.withdraw(200)
    println("Final Balance OOP: ${account.balance}")


    val initialBalance = 1000
    val afterDeposit = deposit(initialBalance, 500)
    val finalBalance = withdraw(afterDeposit, 200)
    println("Final Balance FP: $finalBalance")
}

package section2

/*
* Extension Functions:
*
* Extension functions allow you to add new functionality to existing classes
* without modifying their source code. You can call them as if they were regular
* member functions of the class, making your code cleaner and more expressive.
*/

fun String.isValidEmail(): Boolean {
    val emailRegex = Regex("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")
    return this.matches(emailRegex)
}

fun <K> MutableMap<K, Int>.incrementOrPut(key: K) {
    this[key] = (this[key] ?: 0) + 1
}

fun (() -> Boolean).retry(times: Int): Boolean {
    repeat(times - 1) {
        if (this()) return true
    }
    return this()
}


fun main() {
    val email = "user@example.com"
    println(email.isValidEmail())

    val wordCounts = mutableMapOf("apple" to 3, "banana" to 5)
    wordCounts.incrementOrPut("apple")
    wordCounts.incrementOrPut("cherry")
    println(wordCounts)

    var attempt = 0
    val success = {
        println("Attempting...")
        attempt++
        attempt == 3
    }.retry(5)
    println("Success: $success")
}



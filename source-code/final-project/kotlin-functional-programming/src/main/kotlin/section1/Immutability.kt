package section1

/*
* Immutability:
* It means data cannot be changed once it is created.
*
* Benefits:
* 1. No Side Effects: Since data cannot be changed, it prevents unintended changes elsewhere in the code.
* 2. Thread-Safety: Immutability prevents issues in concurrent or multithreaded programs
*
* Any value defined with `val` is Immutable. But when absolutely necessary, `var` can be used to define mutable variables.
* */

data class User(val name: String, val email: String)

fun immutability() {
    val name = "DroidCon"
    // name = "Droid" // ❌ Compilation error: Val cannot be reassigned **[remove the starting // to check]**

    val codelabs = listOf("Kotlin", "Java", "Dart", "Swift")
    // codelabs.add("Python") // ❌ Error: unresolved reference: add **[remove the starting // to check]**

    val user = User("user", "email")
    // user = User("user1", "email1") // ❌ Compilation error: Val cannot be reassigned **[remove the starting // to check]**

    val greet: (String) -> String = { input -> "Hello, $input!" }
    // greet = { input -> "Hi, $input!" } // ❌ Compilation error: Val cannot be reassigned **[remove the starting // to check]**

    // To change the values we need new vals
    val nameNew = "Droid"
    val codelabsNew = codelabs + "Python"
    val userNew = user.copy(name = "userNew")
}


package section4

/*
* Function Composition:
*
* Function composition is the process of combining two or more functions to form a new function.
* It allows you to build complex behaviors by chaining simple, reusable operations.
* In Kotlin, we can achieve this by using higher-order functions, lambdas, and infix operators
* to create a pipeline of functions that transform data step by step.
*/


// Define functional interfaces for each transformation
fun interface StringTransform {
    fun transform(input: String): String
}

val trimWhitespace: StringTransform = StringTransform { it.trim() }
val toLowerCase: StringTransform = StringTransform { it.lowercase() }
val removeInvalidChars: StringTransform = StringTransform { it.replace(Regex("^[0-9]+|[^a-zA-Z0-9_-]"), "") }


infix fun StringTransform.andThen(next: StringTransform): StringTransform {
    return StringTransform { input -> next.transform(this.transform(input)) }
}

// Composing a function with smaller functions
val processUsername: StringTransform = trimWhitespace andThen toLowerCase andThen removeInvalidChars


fun main() {
    val userInput = "  11User_**Name@1_&*^%123  "
    val processedUsername = processUsername.transform(userInput)
    println("Processed Username: $processedUsername")
}
package section4

/*
 * SAM Constructor (Single Abstract Method Constructor)
 * This feature lets you create an instance of a functional interface by using a lambda expression.
 * It simplifies the process of implementing an interface that has only one method, making your code more concise and readable.
 */


fun interface Transformer {
    fun transform(input: String): String
}

fun main() {
    val toUpperCase = Transformer { it.uppercase() }
    val toLowerCase = Transformer { it.lowercase() }
    val reverse = Transformer { it.reversed() }


    val input = "Hello, Kotlin!"

    println("Original: $input")
    println("Uppercase: ${toUpperCase.transform(input)}")
    println("Lowercase: ${toLowerCase.transform(input)}")
    println("Reversed: ${reverse.transform(input)}")
}

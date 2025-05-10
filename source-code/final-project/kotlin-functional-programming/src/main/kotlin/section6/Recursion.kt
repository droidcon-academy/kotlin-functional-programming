package section6

/*
* Recursion:
* Recursion is a programming technique where a function calls itself to solve smaller instances of the same problem,
* continuing until it reaches a base case — a condition that stops the recursive calls.
* */

// Simple Recursive Function
fun factorial(n: Int): Long {
    return if (n == 0 || n == 1) 1
    else n * factorial(n - 1)
}


// A little advanced example
data class Person(
    val name: String,
    val children: List<Person> = emptyList()
)

fun printFamilyTree(person: Person, indent: String = "") {
    println("$indent- ${person.name}")
    for (child in person.children) {
        printFamilyTree(child, "$indent  ")
    }
}


fun main() {
    val number = 5
    val result = factorial(number)
    println("Factorial of $number is: $result")

    val family = Person(
        name = "Grandpa",
        children = listOf(
            Person(name = "Uncle"),
            Person(
                name = "Dad", children = listOf(
                    Person("Me"),
                    Person("Sibling")
                )
            )
        )
    )
    printFamilyTree(family)
}
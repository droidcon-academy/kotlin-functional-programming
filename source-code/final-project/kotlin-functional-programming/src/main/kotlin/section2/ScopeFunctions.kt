package section2

/*
* Scope Functions:
* Scope functions in Kotlin allow you to execute a block of code within the context of an object.
* These functions help improve code readability by reducing the need to repeatedly reference the object
* and are especially useful for performing operations like initialization or updates in a more concise way.
*
* Essentially, these are predefined extension functions such as `let`, `apply`, `run`, `also`, and `with`.
* Each scope function offers a distinct approach to how the object inside the block is accessed and returned.
*/

/*
* Scope Functions Comparison:
* Below is a comparison of the main scope functions in Kotlin. Each function has specific use cases
* and behaviors that suit different scenarios. This guide should help you choose the right one
* depending on your task.
*
* 1. **let**:
*    - **What it does**: Executes a block of code with the object referred to as `it`, typically for performing
*      operations and returning a different result.
*    - **Object reference**: `it`
*    - **What it returns**: The result of the lambda, not the object itself.
*    - **Typical use case**: Use it when you need to perform operations on an object and return something else.
*
* 2. **apply**:
*    - **What it does**: Executes a block of code with the object as `this`, mainly for modifying the object itself.
*      It returns the object after applying changes.
*    - **Object reference**: `this`
*    - **What it returns**: The object itself after changes.
*    - **Typical use case**: Ideal for object initialization or making modifications to an object without needing to return
*      anything else.
*
* 3. **run**:
*    - **What it does**: Similar to `let`, but works with `this` as the object. It can return anything, not just the object.
*    - **Object reference**: `this`
*    - **What it returns**: The result of the last expression inside the block.
*    - **Typical use case**: Useful when you need to perform operations and return something based on the object.
*
* 4. **also**:
*    - **What it does**: Executes a block of code with the object as `it`, but returns the object itself.
*    - **Object reference**: `it`
*    - **What it returns**: The object itself after performing actions on it.
*    - **Typical use case**: Useful for side-effects like logging, validation, or applying multiple operations
*      while still returning the original object.
*
* 5. **with**:
*    - **What it does**: Similar to `run`, but works with the object as `this` and allows you to call methods or
*      access properties without repeatedly referencing the object.
*    - **Object reference**: `this`
*    - **What it returns**: The result of the last expression inside the block.
*    - **Typical use case**: Best when you have multiple operations to perform on an object and want to avoid
*      repeating the object reference.

* **Summary**:
* - `let` and `also` pass the object as `it`, but `let` returns a result from the block, while `also` returns
*   the object itself.
* - `run` and `with` work with `this`, but `run` is an extension function and can be chained, whereas `with` is not.
* - `apply` is great when you're modifying an object and want to return the modified object.
*/


/*
* In the code below, I've demonstrated the usage of `let` and `run`. Your task is to create a new file
* where you'll showcase the usage of the remaining scope functions (`apply`, `also`, and `with`).
* This will be your code challenge. Have fun!
*/

data class CodeLab(val name: String, val lessons: List<String>) {

    fun showLessons() {
        println("CodeLab: $name")
        lessons.forEach { println(it) }
    }

    fun summary(): String {
        return "Course: $name, Total lessons: ${lessons.size}"
    }
}

fun getCodeLabOrNull(timeout: Long): CodeLab? {
    return if (timeout < 500) {
        Thread.sleep(timeout)
        CodeLab("Kotlin", listOf("Fundamentals", "OOP", "FP", "Concurrency"))
    } else {
        Thread.sleep(500)
        null
    }
}

fun main() {
    // Creating a CodeLab object
    val codeLab = getCodeLabOrNull(400)

    // 1. `let` - Executes the block with the object as `it` inside the lambda, and returns the result
    val lessons = codeLab?.let { it ->
        println("Inside let:")
        it.showLessons()
        println("Summary: ${it.summary()}")

        // The last statement is returned
        it.lessons
    }
    println(lessons)

    // 2. `run` - Functions similarly to `let`, but the object is already in scope, so `it` is not needed
    val newLessons = codeLab?.run {
        println("\nInside run:")
        showLessons()
        println(summary())

        // The last statement is returned
        lessons
    }

    println(newLessons)
}


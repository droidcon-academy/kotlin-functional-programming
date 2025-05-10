package section1

/*
* Referential Transparency:
* We discussed pure functions. There is another property of Pure Functions that is called `Referential Transparencey`.
* Let's take the following example.
* */

data class Codelab(val name: String, val length: Int)

fun createCodeLab(): Codelab {
    return Codelab("Kotlin", 10)
}

/*
* Here `createCodeLab()` is Referentially Transparent, as in our code instead of calling `createCodeLab()` we can replace
* it with `Codelab("Kotlin", 10)` and it will not make any difference.
* */
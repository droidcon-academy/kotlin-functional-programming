package section6

/*
* Tail Recursion:
* Tail recursion is a special kind of recursion where the recursive call is the last thing a function does.
* In Kotlin, such functions can be optimized by the compiler using the tailrec modifier
* to reuse the current stack frame, making them as efficient as loops.
* */

tailrec fun factorialTailRec(n: Int, accumulator: Long = 1): Long {
    return if (n <= 1) accumulator
    else factorialTailRec(n - 1, accumulator * n)
}

fun main() {
    println(factorialTailRec(3))
}

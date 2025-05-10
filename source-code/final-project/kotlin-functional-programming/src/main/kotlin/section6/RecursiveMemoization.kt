package section6

val memo = mutableMapOf<Int, Long>()

fun factorialMemoized(n: Int): Long {
    if (n in memo) {
        println("Fetching from cache: factorial($n) = ${memo[n]}")
        return memo[n]!!
    }

    if (n == 0) return 1

    val result = n * factorial(n - 1)
    memo[n] = result
    println("Calculating factorial($n) = $result")
    return result
}

fun main() {
    println(factorialMemoized(6))
    println(factorialMemoized(5))
    println(factorialMemoized(4))
    println(factorialMemoized(3))
}

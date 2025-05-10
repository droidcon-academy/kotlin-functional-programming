package section7

/*
* crossinline:
*
* Sometimes, you want to inline a lambda but also prevent it from doing things
* like using `return` to jump out of the calling function.
*
* `crossinline` says: “Yes, I’ll inline you, but you can’t use `return` to escape.”
*
* Use it when you pass the lambda to another function (like a thread or callback).
*/

inline fun runTransformation(
    prices: List<Double>,
    crossinline transform: (Double) -> Double
): List<Double> {
    return prices.map {
        transform(it) //crossinline
    }
}

fun main() {
    val prices = listOf(100.0, 200.0, 300.0)
    val discountedPrices2 = runTransformation(prices, discount)
    println("Discounted prices: $discountedPrices2")
}
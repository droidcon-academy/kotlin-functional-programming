package section7

/*
 * Inline Functions:
 * The `inline` keyword is used to reduce the performance overhead of higher-order functions.
 * When a function is marked as inline, its body is substituted directly at the call site, avoiding function call overhead.
 */

// Function marked with inline
// The lambda is inlined at the call site, eliminating overhead of lambda object creation.
inline fun applyTransformation(prices: List<Double>, transform: (Double) -> Double): List<Double> {
    val result = mutableListOf<Double>()
    for (price in prices) {
        result.add(transform(price)) // The lambda body is inserted directly at this point
    }
    return result
}

// Lambda that applies a 10% discount
val discount: (Double) -> Double = { price -> price * 0.9 }

fun main() {
    val prices = listOf(100.0, 200.0, 300.0)
    val discountedPrices1 = applyTransformation(prices, discount)
    println(discountedPrices1)
}

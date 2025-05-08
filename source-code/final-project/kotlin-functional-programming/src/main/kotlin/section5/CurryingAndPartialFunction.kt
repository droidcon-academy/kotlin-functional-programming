package section5

/*
 * Currying and Partial Function Application in Kotlin
 * Currying splits a function into multiple functions, each accepting one parameter at a time.
 * Partial function application pre-fills some arguments, returning a new function with fewer parameters.
 */

// Curried function to calculate discounted price
fun applyDiscount(discount: Double): (Double) -> Double = { price -> price - (price * discount / 100) }

// Partially applied function for a specific discount
val applySummerDiscount = applyDiscount(15.0)

fun main() {
    val originalPrices = listOf(200.0, 500.0, 1200.0, 250.0)

    // Applying summer discount on all products
    val discountedPrices = originalPrices.map { applySummerDiscount(it) }

    println("Discounted Prices: $discountedPrices")
}

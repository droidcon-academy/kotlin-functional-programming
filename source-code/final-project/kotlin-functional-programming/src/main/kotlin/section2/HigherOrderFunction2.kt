package section2

/*
 * Higher Order Functions Continued:
 * As you are using variables to express the functions, it is possible to have default values
 * and nullable values for the lambda parameters
 */

val discountLambda: (Double) -> Double = { price -> price * 0.9 }

fun applyDiscount1(prices: List<Double>, transform: (Double) -> Double = discountLambda): List<Double> {
    val result = mutableListOf<Double>()
    for (price in prices) {
        result.add(transform(price)) // Apply the transformation (lambda) to each element
    }
    return result
}

fun applyDiscount2(prices: List<Double>, transform: ((Double) -> Double)? = null): List<Double> {
    val result = mutableListOf<Double>()
    for (price in prices) {
        if (transform != null) { // Apply the transformation only when it is not null
            result.add(transform(price))
        }
    }
    return result
}

fun main() {
    // Usage without getDiscountFunction()
    val prices = listOf(100.0, 200.0, 300.0)
    val discountedPrices1 = applyDiscount1(prices)
    println(discountedPrices1)
}
package section2

/*
 * Higher Order Functions:
 * We've seen that lambda expressions are functions treated as variables.
 * Now that they're variables, they can be passed as parameters to other functions
 * or even returned from functions.
 */

// Higher-order function that applies a transformation to each element in a list
// This function is taking a function/lambda as an argument
fun applyTransformation(prices: List<Double>, transform: (Double) -> Double): List<Double> {
    val result = mutableListOf<Double>()
    for (price in prices) {
        result.add(transform(price)) // Apply the transformation (lambda) to each element
    }
    return result
}


// This function returns a discount calculation lambda/function
fun getDiscountFunction(discountType: String): (Double) -> Double {
    return when (discountType) {
        "percentage" -> { price -> price * 0.85 } // 15% off
        "fixed" -> { price -> price - 50 } // Fixed 50 off
        else -> { price -> price } // No discount
    }
}

// Lambda that applies a 10% discount
val discount: (Double) -> Double = { price -> price * 0.9 }

fun main() {
    // Usage without getDiscountFunction()
    val prices = listOf(100.0, 200.0, 300.0)
    val discountedPrices1 = applyTransformation(prices, discount)
    println(discountedPrices1)

    // Usage with getDiscountFunction()
    val discountFunction = getDiscountFunction("percentage")
    val discountedPrices2 = applyTransformation(prices, discountFunction)
    println(discountedPrices2)
}
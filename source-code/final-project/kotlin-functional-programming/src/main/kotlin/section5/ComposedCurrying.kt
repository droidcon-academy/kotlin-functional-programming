package section5

/*
* Composed Currying:
*
* Function composition is the process of combining two or more functions to form a new function. We learned this in previous lesson.
* If we apply the same method with function currying that we already learned. We call it composed currying.
* Below is an example.
*/

fun applyTax(taxRate: Double): (Double) -> Double = { price -> price + (price * taxRate / 100) }
fun formatPrice(): (Double) -> String = { price -> "$${"%.2f".format(price)}" }

val applyDiscountAndTaxAndFormat: (Double) -> String = { price ->
    formatPrice()(applyTax(10.0)(applyDiscount(15.0)(price)))
}

fun main() {
    val originalPrices = listOf(200.0, 500.0, 1200.0, 250.0)
    val finalPrices = originalPrices.map { applyDiscountAndTaxAndFormat(it) }
    println("Final Prices: $finalPrices")
}

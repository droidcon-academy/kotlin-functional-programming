package section5

/*
 * Memoization and Lazy Evaluation in Kotlin
 * Memoization helps optimize the calculation by storing the result of expensive computations.
 * Lazy evaluation delays computation until the result is actually required, saving resources.
 */

data class Product(val name: String, val price: Double, val discount: Double)

fun main() {
    val totalDiscount: (List<Product>) -> Double = memoize { products: List<Product> ->
        println("Calculating total discount...")
        products.sumOf { it.price * it.discount / 100 }
    }

    val order = generateSequence(1) { it + 1 }
        .map {
            Product("Product $it", price = 100.0 + it * 10, discount = 5.0 + it) // Lazy product price and discount calculation
        }
        .take(5)

    println("Total discount: ${totalDiscount(order.toList())}")
    println("Products in the order: ${order.take(2).toList()}")
}


fun <T, R> memoize(f: (T) -> R): (T) -> R {
    val cache = mutableMapOf<T, R>()
    return { t: T ->
        cache.computeIfAbsent(t) { f(t) }
    }
}

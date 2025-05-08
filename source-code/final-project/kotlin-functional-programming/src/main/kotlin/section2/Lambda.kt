package section2

/*
 * Lambda Expression:
 * This example demonstrates how to convert a normal function
 * into a lambda expression in Kotlin. 💡
 */

// Normal function to apply a discount
fun applyDiscount(price: Double, discount: Double): Double {
    return price - (price * discount / 100)
}

// Equivalent lambda expression for the above function
val applyDiscount: (Double, Double) -> Double = { price: Double, discount: Double ->
    price - (price * discount / 100)
}


fun main(){
    val price = 100.0
    val discount = 10.0 //10% discount

    println(applyDiscount(price, discount))
    println(applyDiscount.invoke(price, discount))
}

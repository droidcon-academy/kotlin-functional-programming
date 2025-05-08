package section3

// #1 .asSequence()
// Converts the collection to a sequence, enabling lazy evaluation (elements are processed one at a time).
/*  Optimizes collection processing by using lazy evaluation with sequences. */
val sequenceOfDestinations = travelList.asSequence()

// #2 .map() with sequences
/*  Transforms each item lazily as they are accessed. */
val processedDestinations = sequenceOfDestinations.map {
    println("Processing: $it") // Demonstrating Lazy Evaluation
    it.copy(estimatedCost = (it.estimatedCost * 1.1).toInt())
}

val processedDestinations1 = travelList.map {
    println("Processing: $it")
    it.copy(estimatedCost = (it.estimatedCost * 1.1).toInt())
}


fun main() {
    val iterator = processedDestinations.iterator()
    (0..1).forEach { i ->
        println(iterator.next())
    }
}

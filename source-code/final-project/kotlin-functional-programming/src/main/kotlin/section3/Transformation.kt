package section3

// #1 .map()
/*  Transforms each item in a collection and returns a new collection with the modified elements. */
val destinationNames = travelList.map { it.name }

// #2 .filter()
/*  Filters items based on a condition, keeping only those that satisfy it. */
val internationalDestinations = travelList.filter { it.isInternational }

// #3 .flatMap()
/*  Transforms each element into a collection and then flattens them into a single collection. */
val destinationDetails = travelList.flatMap { listOf(it.name, it.estimatedCost.toString()) }

// #4 .zip()
/*  Combines two collections element by element into pairs. */
val destinationCosts = travelList.map { it.estimatedCost }
val destinationPairs = travelList.map { it.name }.zip(destinationCosts)

// #5 .associate()
/*  Converts a collection into a map, using custom keys and values for each item. */
val destinationMap = travelList.associate { it.name to it.estimatedCost }

fun main() {
    println(destinationNames)
    println(internationalDestinations)
    println(destinationDetails)
    println(destinationPairs)
    println(destinationMap)
}
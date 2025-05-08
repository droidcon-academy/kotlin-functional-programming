package section3

// #1 .fold()
/*  Accumulates a value by applying a function to each element, starting with an initial value. */
val totalEstimatedCost = travelList.fold(0) { accumulator, destination ->
    accumulator + destination.estimatedCost
}

// #2 .reduce()
/*  Similar to fold but does not require an initial value. It uses the first element of the collection. */
val totalEstimatedCostUsingReduce = travelList.map { it.estimatedCost }.reduce { accumulator, cost ->
    accumulator + cost
}

// #3 .sum() / .sumBy {} / .sumOf {}
/*  Adds up numeric values from the collection. */
val totalCostUsingSum = travelList.sumOf { it.estimatedCost }

// #4 .count()
/*  Counts the number of elements in the collection or those matching a condition. */
val visitedDestinationsCount = travelList.count { it.isVisited }

// #5 .average()
/*  Gets the average value of numeric items in the collection. */
val averageCost = travelList.map { it.estimatedCost }.average()

// #6 .maxOrNull() / .minOrNull()
/*  Finds the maximum or minimum element in the collection or null if the collection is empty. */
val maxEstimatedCost = travelList.maxByOrNull { it.estimatedCost }
val minEstimatedCost = travelList.minByOrNull { it.estimatedCost }

fun main() {
    println("Total estimated cost (fold): $totalEstimatedCost")
    println("Total estimated cost (reduce): $totalEstimatedCostUsingReduce")
    println("Total cost (sumOf): $totalCostUsingSum")
    println("Visited destinations count: $visitedDestinationsCount")
    println("Average cost: $averageCost")
    println("Max estimated cost: $maxEstimatedCost")
    println("Min estimated cost: $minEstimatedCost")
}



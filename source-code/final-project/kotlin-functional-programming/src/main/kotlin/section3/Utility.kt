package section3

// #1 .sortedBy {}
/*  Sorts the list based on a given condition using a lambda. */
val sortedDestinations = travelList.sortedBy { it.estimatedCost }

// #2 .distinctBy {}
/*  Removes duplicate items based on a condition provided by a lambda. */
val distinctDestinations = travelList.distinctBy { it.name }

// #3 .takeWhile {}
/*  Takes elements from the list while the condition (lambda) is true. */
val destinationsBeforeVisit = travelList.takeWhile { it.isVisited }

// #4 .dropWhile {}
/*  Drops elements from the list while the condition (lambda) is true. */
val destinationsAfterFirstVisit = travelList.dropWhile { it.isVisited }

// #5 .chunked(n) with lambda
/*  Breaks the list into chunks of size 'n', while applying a lambda for chunk processing. */
val chunkedDestinations = travelList.chunked(2) { it -> it.filter { destination -> destination.isInternational } }

// #6 .groupBy {}
/*  Groups the items by a specified key using a lambda expression. */
val destinationsGroupedByVisit = travelList.groupBy { it.isVisited }

fun main() {
    println("Sorted destinations: $sortedDestinations")
    println("Distinct destinations: $distinctDestinations")
    println("Chunked destinations: $chunkedDestinations")
    println("Destinations grouped by visit status: $destinationsGroupedByVisit")
}

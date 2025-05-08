package section3

// #1 .find()
/*  Finds the first destination that matches a condition, or returns null if no match is found. */
val firstVisitedDestination = travelList.find { it.isVisited }

// #2 .first() / .last()
/*  Gets the first or last destination that matches a condition. */
val firstInternationalDestination = travelList.first { it.isInternational }
val lastVisitedDestination = travelList.last { it.isVisited }

// #3 .any()
/*  Checks if there’s at least one destination that matches a condition. */
val hasVisitedInternationalDestination = travelList.any { it.isInternational && it.isVisited }

// #4 .all()
/*  Checks if all destinations satisfy a condition. */
val allVisited = travelList.all { it.isVisited }

// #5 .none()
/*  Checks if no destination matches a given condition. */
val noInternationalDestinationsVisited = travelList.none { it.isInternational && it.isVisited }

// #6 .contains()
/*  Checks if the list contains a specific destination. */
val containsBali = travelList.map { it.name }.contains("Bali")

fun main() {
    println(firstVisitedDestination)
    println(firstInternationalDestination)
    println(lastVisitedDestination)
    println(hasVisitedInternationalDestination)
    println(allVisited)
    println(noInternationalDestinationsVisited)
}

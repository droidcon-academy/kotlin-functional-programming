package section3

/*
 * Collections and Lambdas
 * We use collections to hold multiple values — for example, lists, maps, sequences, etc.
 * You’ve probably used them many times already.
 * In Kotlin, we get many utility functions to process, manage, and transform collections.
 * For example, .map() to convert items, .find() to locate an item, or .filter() to select items based on a condition.
 */

// A data class for our upcoming examples
data class Destination(
    val name: String,
    val isInternational: Boolean,
    val estimatedCost: Int,
    val isVisited: Boolean
)

// This is our travel list, which we'll use for all the examples in this section.
// Each destination contains details as you can see in the above data class.
val travelList = listOf(
    Destination("Bali", isInternational = true, estimatedCost = 1200, isVisited = false),
    Destination("Jaipur", isInternational = false, estimatedCost = 300, isVisited = true),
    Destination("Tokyo", isInternational = true, estimatedCost = 2000, isVisited = false),
    Destination("Goa", isInternational = false, estimatedCost = 400, isVisited = true),
    Destination("Iceland", isInternational = true, estimatedCost = 2500, isVisited = false),
    Destination("Kerala", isInternational = false, estimatedCost = 350, isVisited = false)
)

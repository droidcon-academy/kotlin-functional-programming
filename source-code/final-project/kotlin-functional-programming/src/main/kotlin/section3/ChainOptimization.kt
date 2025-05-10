package section3

/*
* Chain Optimization:
*
* When we work with a list of data and apply a series of operations (like filter, map, take, etc.),
* it's easy to chain them one after another. But if we aren't careful, this can lead to unnecessary
* processing or memory usage. Chain optimization is all about writing that kind of code smarter—
* making sure it runs efficiently without losing clarity.
*
* Best Practices:
* - Convert collections to sequences early if you're chaining many operations — it avoids creating temporary lists.
* - Keep lighter operations (like filter or take) near the beginning to cut down on unnecessary work later.
* - Avoid repeating the same transformation more than once — do it once and reuse.
*
* In short: Write it clean, but think about performance while you're at it.
*/

// Chain optimization using Sequence
val toVisitSoon = travelList
    .asSequence()
    .filter { !it.isVisited }
    .filter { it.estimatedCost < 1500 } //added filter first, so that the next transformation [.map] operation is optimized
    .map { it.name }
    .take(2) // Before converting to list again taking only two
    .toList()

fun main() {
    println(toVisitSoon)
}
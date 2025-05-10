package section7

/*
 * Labeled Returns in Lambdas:
 */

data class Task(val description: String, val isUrgent: Boolean)

val tasks = listOf(
    Task("Buy groceries", isUrgent = false),
    Task("Finish report", isUrgent = true),
    Task("Fix server issue", isUrgent = false),
    Task("Schedule meeting", isUrgent = false)
)

val processTask: (List<Task>) -> Unit = processTask@{ tasks ->
    tasks.forEach { task ->
        if (task.isUrgent) {
            println("Urgent task found: ${task.description}. Stopping further processing.")
            return@processTask
        }
        println("Processing non-urgent task: ${task.description}")
    }
}

fun main() {
    processTask.invoke(tasks)
}

package section7

import java.time.LocalDate

/*
 * Anonymous Functions:
 */

data class Ticket(val name: String, val deadline: LocalDate, val isUrgent: Boolean)

val tickets = listOf(
    Ticket("Submit report", LocalDate.of(2025, 5, 1), isUrgent = true),
    Ticket("Complete assignment", LocalDate.of(2025, 5, 5), isUrgent = false),
    Ticket("Attend meeting", LocalDate.of(2025, 5, 2), isUrgent = true),
    Ticket("Clean office", LocalDate.of(2025, 5, 10), isUrgent = false)
)

fun main() {
    val filterOverdueUrgentTasks: (List<Ticket>) -> List<Ticket> = fun(tasks: List<Ticket>): List<Ticket> {
        val today = LocalDate.now()
        return tickets.filter { task ->
            task.isUrgent && task.deadline.isBefore(today)  // Filters urgent tasks that are overdue
        }
    }

    val overdueUrgentTasks = filterOverdueUrgentTasks(tickets)

    println("Overdue urgent tasks:")

    overdueUrgentTasks.forEach { task ->
        println("${task.name}, Deadline: ${task.deadline}")
    }
}


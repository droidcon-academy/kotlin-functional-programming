# Kotlin Functional Programming: Section 7 Code Challenge

---

## 📚 Topics Covered

- Optimize performance with inline functions.
- Using crossinlines
- Manage control flow in lambdas using labeled returns.
- Use anonymous functions

---

## ✅ Task
You are given a TaskExecutor class that executes tasks in a specific order. You need to implement a function `executeTasks` that accepts a list of tasks (functions), where each task has its own behavior.

- Tasks may need to be executed inline (e.g., with high performance in mind). 
- Tasks may use crossinline to prevent non-local returns (to make sure no task exits the execution flow prematurely). 
- Tasks can be passed as anonymous functions.

A labeled return is needed to skip a task in case of a certain condition (for example, make a label `DO_NOT_PROCESS`).

```kotlin
enum class TaskResult {
    SUCCESS,
    DO_NOT_PROCESS
}
```

```kotlin
inline fun executeTasks(tasks: List<() -> TaskResult>, crossinline onSkip: (Int) -> Boolean)
```
The `executeTasks` function should:

- Iterate over each task in the tasks list. 
- If a task returns `DO_NOT_PROCESS`, skip it and continue to the next task. 
- If the onSkip condition returns true for any task, skip that task (using a labeled return). 
- The `executeTasks` function should execute inline to optimize performance (using the inline keyword). 
- The tasks are provided as anonymous functions inside the list.
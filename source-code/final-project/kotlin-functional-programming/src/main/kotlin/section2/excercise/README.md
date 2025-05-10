# Kotlin Functional Programming: Section 2 Code Challenge

---

## 📚 Topics Covered

- Understand how lambdas work as function parameters and return type.
- Higher Order Functions
- Extension Functions
- Scope Functions
- Closure

---

## ✅ Tasks

### 1. Lambda Conversion

Given a normal function below, you need to write the lambda equivalent.

```kotlin
fun isValidEmail(email: String): Boolean {
    val regex = "^[A-Za-z](.*)([@]{1})(.{1,})(\\.)(.{1,})$"
    return email.matches(regex.toRegex())
}
```

### 2. Higher Order Functions

Write a higher-order function called withRetry that accepts:
- `times`: Int parameter indicating how many times to retry
- `block: () -> T` lambda representing the operation to be retried
The function should retry executing the lambda if an exception is thrown, up to the specified number of times, and
return the result if successful. If all retries fail, it should rethrow the last exception.

```kotlin
fun <T> withRetry(times: Int, block: () -> T): T {
    // Your implementation here
}
```

### 3. Extension Function
Imagine you're building a DroidCon learning app, and you have a class called DroidConCodelab that looks like this:
```kotlin
data class DroidConCodelab(
    val course: String,
    val lessons: List<String>,
    val isFinished: Boolean
)
```
Your task is to write an extension function called `summary()` for this class, which returns a nicely formatted multi-line summary of the object.
When the `summary()` function is called on an instance, it should return a string like this:
```text
📘 Course: Jetpack Compose Basics
📝 Lessons: 3
✅ Status: Completed
```

### 4. Scope Functions 
You're building an onboarding flow for new courses in your learning app. You need to create and configure a DroidConCodelab object using Kotlin's scope functions to make the code clean and expressive.
Use `apply`, `also`, `run`, or `with` appropriately in the given context.
```kotlin
data class DroidConCodelab(
    var course: String,
    var lessons: List<String>,
    var isFinished: Boolean
)
```
- Create a new DroidConCodelab object. 
- Use apply to initialize its properties. 
- Use also to log a message after creation. 
- Use run or with to get and return a short summary string. 

### 5. Closure
You're building a simple chat app, and to prevent spamming, you want to limit how frequently a user can send messages.
Your task is to write a function called `createMessageLimiter(interval: Long)` that returns a lambda.
The returned lambda will accept a message String and print it only if at least interval milliseconds have passed since the last allowed message. Otherwise, it should print `"⏳ You're sending messages too quickly!"`

```kotlin
fun createMessageLimiter(interval: Long): (String) -> Unit {
    // Your implementation here
}

//Example Usage
fun main() {
    val sendMessage = createMessageLimiter(2000)

    sendMessage("Hello!") //Should print: Hello!
    Thread.sleep(1000)
    sendMessage("Again!") //Should print: You're sending messages too quickly!
    Thread.sleep(1500)
    sendMessage("Now?") //Should print: Now?
}
```

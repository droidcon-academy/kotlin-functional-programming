# Kotlin Functional Programming: Section 4 Code Challenge

---

## 📚 Topics Covered

- Convert lambdas into functional interfaces with SAM constructors.
- Compose multiple functions to create reusable transformations

---

## ✅ Tasks

### 1. SAM Constructor
Given the following `interface`
```kotlin
interface EventListener {
    fun onEvent(event: String)
}
```
Create the following event listeners 
- Button Clicked
- Form Submitted
- Error Occurred 

### 2. Composition 
Define an interface `DataSanitizer` that represents a `transformation` on a string.
```kotlin
fun interface DataSanitizer {
    fun transform(input: String): String
}
```
Create the following small transformation functions:
- `removeSpaces`: Removes all spaces from the string. 
- `convertToUppercase`: Converts the string to uppercase. 
- `removeSpecialChars`: Removes any special characters except alphanumeric characters and underscores.

Create an `andThen` function to combine multiple transformation functions.
Compose these transformations into a final sanitization function that processes the input string.



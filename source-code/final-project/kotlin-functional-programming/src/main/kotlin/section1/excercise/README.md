# Kotlin Functional Programming: Section 1 Code Challenge

Welcome to the end-of-section challenge for **Section 1: Fundamentals of Functional Programming in Kotlin**. This short exercise will help you apply the core principles you've just learned.

---

## 📚 Topics Covered

- Object-Oriented vs Functional Thinking
- Immutability
- Pure Functions
- Referential Transparency

---

## ✅ Tasks

### 1. Immutable Data
Create a `data class` named `User` with fields `name` and `age`. Write a function `birthday(user: User): User` that returns a **new** user with the age incremented by 1, without modifying the original.

### 2. Pure Function Conversion
Write a function `fahrenheitToCelsius(f: Double): Double`. It should convert Fahrenheit to Celsius and must not use any external state or side effects.

### 3. Safe List Append
Write a function `addToList(list: List<Int>, element: Int): List<Int>` that returns a new list with the element added to the end. Ensure the original list is unchanged.

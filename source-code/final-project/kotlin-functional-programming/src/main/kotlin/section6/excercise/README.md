# Kotlin Functional Programming: Section 6 Code Challenge

---

## 📚 Topics Covered

- Recursion
- RecursiveMemoization
- Leverage tail recursion for optimizing recursive functions.
---

## ✅ Task

### 1. 
Write a tail-recursive function to calculate the sum of all integers from 1 to n. The function should return the sum efficiently using tail recursion.
- `sumUpTo(5)` should return 15 because 1 + 2 + 3 + 4 + 5 = 15. 
- `sumUpTo(10)` should return 55 because 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55.

Function Signature 
```kotlin
tailrec fun sumUpTo(n: Int, accumulator: Int = 0): Int
```

### 2. 
You need to calculate the nth Fibonacci number efficiently using recursion and memoization. The Fibonacci sequence is defined as:
- F(0) = 0 
- F(1) = 1 
- F(n) = F(n-1) + F(n-2) for n > 1

The naive recursive solution to calculate Fibonacci numbers has exponential time complexity, which becomes inefficient for larger values of n. Your task is to optimize this solution using memoization to store previously computed values and reduce redundant calculations.



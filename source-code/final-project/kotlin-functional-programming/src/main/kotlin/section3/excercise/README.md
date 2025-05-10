# Kotlin Functional Programming: Section 3 Code Challenge

---

## 📚 Topics Covered

- Use lambdas to simplify operations on collections.
- Transform collections with filter and map.
- Use fold and reduce to aggregate values in collections efficiently.
- Use all, any, count, and find for predicates.
- More Utility Functions
- Optimize collection processing with sequences.
- Chain Optimization
- Lazy Evaluation

---

## ✅ Tasks

### 1. Using Lambdas to Simplify Collection Operation
You're given a list of travel records, where each record contains information about a destination and whether it was visited.
Your task is to extract only the names of visited destinations and return them as a `List<String>`, using Kotlin's predefined collection functions.
Then, optimize your solution using Sequence to minimize memory usage.
```kotlin
val travelList = listOf(
    Destination("Bali", isInternational = true, estimatedCost = 1200, isVisited = false),
    Destination("Jaipur", isInternational = false, estimatedCost = 300, isVisited = true),
    Destination("Tokyo", isInternational = true, estimatedCost = 2000, isVisited = false),
    Destination("Goa", isInternational = false, estimatedCost = 400, isVisited = true),
    Destination("Iceland", isInternational = true, estimatedCost = 2500, isVisited = false),
    Destination("Kerala", isInternational = false, estimatedCost = 350, isVisited = false)
)
```

### 2. Collection Operation 
You’re building a fitness analytics feature for a workout app. Users perform multiple workouts per week, and each workout has the following structure:
```kotlin
data class Workout(
    val type: String,
    val durationInMinutes: Int,
    val caloriesBurned: Int,
    val completed: Boolean
)
```
You are given a list of workouts. Your job is to generate key analytics using Kotlin’s collection functions:
```kotlin
val workouts = listOf(
    Workout("Cardio", 25, 300, true),
    Workout("Strength", 45, 550, true),
    Workout("Yoga", 30, 200, false),
    Workout("Cardio", 40, 400, true),
    Workout("HIIT", 20, 600, true)
)
```
You have to find the following.
- Total calories burned 
- Average workout duration 
- Whether all workouts were completed 
- Whether any workout burned more than 500 calories 
- Count of workouts shorter than 30 minutes 
- The first workout of type `"Cardio"`

### 3. Lazy 
You have the following class. 
```kotlin
data class ApiClient(val baseUrl: String, val timeout: Int)
```
Initialize an object for this when it is needed using lazy.  
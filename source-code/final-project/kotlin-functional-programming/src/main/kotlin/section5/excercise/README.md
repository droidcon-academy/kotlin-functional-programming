# Kotlin Functional Programming: Section 5 Code Challenge

---

## 📚 Topics Covered

- Apply currying and partial function application to simplify function calls
- Composing with curried functions
- Implement function pipelines for structured data processing.
- Use memoization

---

## ✅ Task
You are building an order processing system where a customer can place an order for a product. The system needs to calculate the final price after applying a series of transformations, including:
- Discounts (percentage off)
- Tax (applicable tax rate)
- Shipping fee (based on order value)

The system should:
- Calculate the price with discounts applied (using curried functions). 
- Apply taxes and shipping fees (using a pipeline of functions). 
- Use memoization to optimize repeated calculations for the same order (e.g., when the same order details are processed multiple times). 
- Allow for partial functions to handle common scenarios (e.g., applying a fixed discount on specific products).

Do The Following
- Create curried functions for calculating discounts, taxes, and shipping fees. 
- Use partial functions for commonly applied rules, like a fixed discount for "VIP" customers. 
- Create a function pipeline to process the entire order, applying all transformations in sequence. 
- Use memoization to ensure that repeated processing of the same order doesn't require redundant calculations.

Hints
- Curried functions allow partial application, making it easier to reuse certain transformations like applying a fixed discount or tax rate. 
- Function pipelines can be created using the andThen function, which allows chaining transformations in a sequence. 
- Memoization can drastically improve performance if you're processing the same order multiple times with the same input.
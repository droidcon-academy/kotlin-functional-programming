package section1

import java.util.Locale

/*
 * A **Pure Function** is a function that satisfies two key conditions:
 *
 * 1. **Deterministic**: Given the same input, it always produces the same output.
 * There’s no randomness or variability in its results.
 * 2. **No Side Effects**: It doesn’t modify any external state or depend on anything that could change over time.
 * For example, it doesn't interact with global variables, perform I/O operations, or rely on database values or external APIs.
 */


fun isPasswordStrong(password: String): Boolean {
    return password.length >= 8 &&
            password.any { it.isDigit() } &&
            password.any { it.isUpperCase() }
}

fun isValidEmail(email: String): Boolean {
    return Regex("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$").matches(email)
}

fun getInitials(fullName: String): String {
    return fullName.trim()
        .split("\\s+".toRegex())
        .mapNotNull { it.firstOrNull()?.uppercaseChar() }
        .joinToString("")
}

fun formatCurrency(amount: Double): String {
    return String.format(Locale.US, "$%.2f", amount)
}



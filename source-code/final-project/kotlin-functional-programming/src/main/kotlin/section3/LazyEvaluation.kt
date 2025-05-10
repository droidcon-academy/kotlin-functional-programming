package section3

/*
* Lazy Evaluation in Kotlin:
* Lazy evaluation is a programming technique where an expression is not evaluated until its value is actually needed.
* In Kotlin, lazy evaluation is often used to defer the initialization of variables,
* and it's a great way to optimize performance, especially for costly operations.
*
* Kotlin provides the `lazy` delegate for lazy initialization.
*
* Here's how lazy evaluation works in Kotlin:
*/

data class AppConfig(val apiEndpoint: String, val apiKey: String, val timeout: Int)

fun loadConfig(): AppConfig {
    println("Loading Config....")
    Thread.sleep(3000) //Mimicking costly operation
    return AppConfig("endpoint", "key", 1000)
}

fun main() {
    val config by lazy { loadConfig() } //Lazy Initialization

    println("Processing different data...")
    Thread.sleep(2000L)

    println(config)
}
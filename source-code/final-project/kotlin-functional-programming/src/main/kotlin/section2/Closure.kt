package section2

/*
* Closure:
* A closure is a function (or lambda) that captures variables from its surrounding scope
* and remembers their values even after the outer function has finished executing.
* It lets you preserve state across multiple calls without using global variables.
*/


fun createDebouncedClickHandler(debounceTime: Long): (String) -> Unit {
    var lastClickTime = 0L
    return { action ->
        val currentTime = System.currentTimeMillis()
        if (currentTime - lastClickTime > debounceTime) {
            lastClickTime = currentTime
            println("Action performed: $action")
        } else {
            println("Click ignored due to debounce")
        }
    }
}

fun main() {
    val debouncedClick = createDebouncedClickHandler(1000)
    debouncedClick("Button 1")
    Thread.sleep(500)
    debouncedClick("Button 1")
    Thread.sleep(500)
    debouncedClick("Button1")
}
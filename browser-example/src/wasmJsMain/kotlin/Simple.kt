import kotlinx.browser.document
import kotlinx.dom.appendText

fun main() {
    document.body?.appendText("Hello, ${greet()}!")
}

fun greet() = "worlddddd"
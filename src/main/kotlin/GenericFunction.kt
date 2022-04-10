import data.Function

fun main() {
    val function = Function("Amelia")

    function.sayHello<String>("Ihsan")
    function.sayHello("Ihsan")

    function.sayHello<Int>(10)
    function.sayHello(10)
}
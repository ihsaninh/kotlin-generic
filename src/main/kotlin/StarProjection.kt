fun displayLength(array: Array<*>) {
    println("Length Array is ${array.size}")
}

fun main() {
    val arrayInt: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val arrayString: Array<String> = arrayOf("Ihsan", "and", "Amelia")

    displayLength(arrayInt)
    displayLength(arrayString)
}
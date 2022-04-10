import data.MyData

fun main() {
    val myDataString: MyData<String, Int> = MyData<String, Int>("Ihsan", 100)
    myDataString.printData()

    val myDataInt: MyData<Int, String> = MyData<Int, String>(100, "Ihsan")
    myDataInt.printData()
}
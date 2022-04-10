package data

class MyData<T, U>(private val firstData: T, private val secondData: U) {
    fun getData(): T = firstData

    fun getSecond(): U = secondData

    fun printData() {
        println("Data is $firstData $secondData")
    }

}
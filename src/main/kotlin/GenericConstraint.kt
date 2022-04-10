interface CanSayHello {
    fun sayHello(name: String)
}

open class Employee

class Manager : Employee()

class VicePresident : Employee(), CanSayHello {
    override fun sayHello(name: String) {
        println("Hello $name, I'm Vice President")
    }

}

//class Company<T : Employee>(val employee: T)
// where keyword
class Company<T>(val employee: T) where T : Employee, T : CanSayHello

fun main() {
    // val data1 = Company(Manager()) // error CanSayHello
    val data2 = Company(VicePresident())
    // val data3 = Company(Employee()) // error CanSayHello
    // val data4 = Company("String") // error
}
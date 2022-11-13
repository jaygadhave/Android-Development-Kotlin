fun main(args: Array<String>) {

    val name: String = "Jay Bharat"
    val list = listOf<String>("A", "B", "C", "D", "E", "F")

    DemoClass().run {

        firstFun()
        SecondFunction()
    }

}

class DemoClass() {
    fun firstFun() {
        println("First Function")
    }

    fun SecondFunction() {
        println("Second Function")

    }
}


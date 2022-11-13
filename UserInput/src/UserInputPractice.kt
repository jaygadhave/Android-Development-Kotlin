fun main(args: Array<String>) {

    println("Enter Input")
    val input = readLine()?:""
    val boolInput=input.toBoolean()
    println(boolInput::class.java)
}
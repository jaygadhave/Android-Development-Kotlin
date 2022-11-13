fun main(args: Array<String>) {

    println("Enter Q of Product")
    val productQ = readLine()

    val productValue = 20
//!!
    println("Final Price is ${productQ!!.toInt()!!.times(productValue)}")

}
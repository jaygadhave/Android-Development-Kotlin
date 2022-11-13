fun main(args: Array<String>) {

    println("Enter Q of Product")
    val a = readLine() ?: ""
    val q = a.toInt()

    println("Enter Price of Product")
    val b = readLine() ?: ""
    val price = b.toInt()

    println(makeBill(q, price))

}

fun makeBill(q: Int, price: Int): Double {
    val totalAmountofBill = q * price
    val discount = totalAmountofBill * 0.10
    val finalrate = totalAmountofBill - discount
    return finalrate
}




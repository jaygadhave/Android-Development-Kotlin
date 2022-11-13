package Shop

fun main(args: Array<String>) {
    println("Welcome to Function Toy")
    val list = arrayListOf<ShopProduct>()
    list.add(ShopProduct(name = "Bag", price = 600))
    list.add(ShopProduct(name = "Bat", price = 450))
    list.add(ShopProduct(name = "Watch", price = 250))
    list.add(ShopProduct(name = "Pen", price = 10))
    list.add(ShopProduct(name = "Pencil", price = 5))
    list.add(ShopProduct(name = "Car", price = 155))
    list.add(ShopProduct(name = "Bicycle", price = 252))
    println("-------------------------------------- \n ")
    println("Products :")
    for (items in list) {
        println("${items.name} Rate : ${items.price}")
    }
    println("-------------------------------------- \n ")
    println("What you want to purchase?")
    val a = readLine() ?: ""
    println("How many $a you want to buy?")
    val q = readLine() ?: ""
    val qq = q.toInt()
    var price = 0
    when (a) {
        "Bag" -> {
            price = 600
        }
        "Bat" -> {
            price = 450
        }
        "Watch" -> {
            price = 250
        }
        "Pen" -> {
            price = 10
        }
        "Pencil" -> {
            price = 5
        }
        "Car" -> {
            price = 155
        }
        "Bicycle" -> {
            price = 252
        }
        else -> {
            price = 0
        }
    }

    val finalBill = price * qq
    println("Pay $finalBill and take your product")

}
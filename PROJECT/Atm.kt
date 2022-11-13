fun main(args: Array<String>) {


    var totalBalance = 10000
    println("******** ATM Machine ********")
    println("Press 1 for check Balance")
    println("Press 2 Withdraw Amount")
    println("Press 3 Deposit Amount")
    println("Press 4 Exit")
    val a = readLine() ?: ""
    val choice = a.toInt()

    when (choice) {
        1 -> {
            println("You have $totalBalance Rs Balance")
        }
        2 -> {
            println("Enter Amount You want to Withdraw?")
            val b = readLine() ?: ""
            val amount = b.toInt()

            if (amount > totalBalance) {
                println("You have $totalBalance you can not withdraw $amount")
            } else {
                totalBalance -= amount
                println("$amount is ")
                println("Now you have $totalBalance Rs Balance")
            }
        }
        3 -> {
            println("Enter Amount You want to Deposit?")
            val b = readLine() ?: ""
            val amount = b.toInt()
            totalBalance += amount

            println("Now you have $totalBalance Rs Balance")
        }
        4 -> {
            println("Thank You Visit Again")
        }
    }
}




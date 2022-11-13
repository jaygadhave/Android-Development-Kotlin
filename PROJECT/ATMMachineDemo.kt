fun main(args: Array<String>) {
    var currentBalance = 10000
    println("Welcome To sasta ATM Machine")
    println("Enter 1 for Check Balance")
    println("Enter 2 for Deposit Amount")
    println("Enter 3 for withdraw Amount")
    println("Enter 4 for Exit Sasta ATM")

    val a = readLine() ?: ""
    val choice = a.toInt()

    when (choice) {
        1 -> {
            println("Your current Balance is $currentBalance")
        }
        2 -> {
            println("How much money do you want to Deposit?")
            val b = readLine() ?: ""
            val amount = b.toInt()
            currentBalance += amount
            println("$amount Deposit Successfully")
            println("Now you have $currentBalance Balance")

        }
        3 -> {
            println("How much money do you want to Withdraw?")
            val b = readLine() ?: ""
            val amount = b.toInt()

            if (amount<currentBalance)
            {
                currentBalance -= amount
                println("$amount Withdraw Successfully")
                println("Now you have $currentBalance Balance")
            }else
            {
                println("No Balance!!")
            }



        }
        4 -> {
            println("Thank you Visit Again!!")
        }
        else -> {
            println("Please Choose Correct Optino")
        }
    }

}
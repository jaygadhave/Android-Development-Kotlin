import kotlin.random.Random

fun main(args: Array<String>) {

    val randomNum = Random.nextInt(1, 5)//3
    println(randomNum)

    var i = 0
    while (i < 3) {
        println("Enter Any Number")
        val a = readLine() ?: ""
        val userGuessNumber = a.toInt()//3
        if (randomNum == userGuessNumber) {
            println("You are win!!")
        } else {
            println("You have ${2-i} Try Remain")
            println("Try Again")
        }
        i++
    }


}
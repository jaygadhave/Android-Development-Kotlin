import kotlin.random.Random

fun main(args: Array<String>) {

    val number = Random.nextInt(1, 5)
    println(number)
    println("Guess Any Number between 1 to 5")
    var i = 0
    while (i < 3) {
        val userNumber = readLine() ?: ""
        val guessNumber = userNumber.toInt()

        if (number == guessNumber) {
            println("You are Win")
        } else {
            println("${2 - i} Try Remain")
            println("Try Again!!")
        }
        i++
    }
    println("Failed Real Number is $number")

}
package Quiz

fun main(args: Array<String>) {
    val listOfQuiz = arrayListOf<Questions>()
    println("Welcome To Quiz App using Kotlin")
    var rightAns = 0
    var wrongAns = 0
    listOfQuiz.add(
        Questions(
            "which is official Language for android Development?",
            "Kotlin",
            "Python",
            "PHP",
            "Java",
            "Kotlin"
        )
    )

    listOfQuiz.add(
        Questions(
            "which symbol is use to single line comments in kotlin?",
            "--",
            "{}",
            "..",
            "//",
            "//"
        )
    )

    listOfQuiz.add(
        Questions(
            "which function is use to get data from user in kotlin?",
            "while()",
            "Expression",
            "Readline()",
            "for()",
            "Readline()"
        )
    )
    println("press 1 to Start game")
    println("press 2 to Exit game")
    val a = readLine() ?: ""
    val choose = a.toInt()

    when (choose) {
        1 -> {
            //quiz

            for (items in listOfQuiz) {
                println("Quiz.Questions : ${items.question}")
                println("optionA : ${items.optionA}")
                println("optionB : ${items.optionB}")
                println("optionC : ${items.optionC}")
                println("optionD : ${items.optionD}")
                println("----------------------------------------")
                println("Enter your Ans")
                val ans = readLine() ?: ""
                if (ans.equals(items.ans)) {
                    rightAns++
                    println("Ans is Right!!")
                } else {
                    wrongAns++
                    println("Sorry Your ans is Wrong!!")
                }
            }

            println("Congratulation your game is over")
            println("Right ans is : $rightAns")
            println("Wrong ans is : $wrongAns")

        }
        2 -> {
            //exit
        }
        else -> {
            //exit
        }
    }

}


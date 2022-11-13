package StudentResult

fun main(args: Array<String>) {

    val list = arrayListOf<StudentsDataClass>()

    for (item in 1..3) {
        println("Enter your name?")
        val a = readLine() ?: ""

        println("Enter Marks of S1")
        val b = readLine() ?: ""
        val ss1 = b.toInt()

        println("Enter Marks of S2")
        val c = readLine() ?: ""
        val ss2 = c.toInt()

        println("Enter Marks of S3")
        val d = readLine() ?: ""
        val ss3 = d.toInt()

        println("Enter Marks of S4")
        val e = readLine() ?: ""
        val ss4 = e.toInt()

        println("Enter Marks of S5")
        val f = readLine() ?: ""
        val ss5 = f.toInt()

        val total = ss1 + ss2 + ss3 + ss4 + ss5
        val pr = total / 5

        list.add(
            StudentsDataClass(
                name = a,
                s1 = ss1,
                s2 = ss2,
                s3 = ss3,
                s4 = ss4,
                s5 = ss5,
                total = total,
                pr = pr.toDouble()
            )
        )
    }
    println("------------------------------------------- \n ")
    for (data in list) {
        print("${data.name} : ${data.s1} ${data.s2} ${data.s3} ${data.s4} ${data.s5} Total : ${data.total} PR : ${data.pr}")
        println()
    }

}

data class StudentsDataClass(
    val name: String = "",
    val s1: Int = 0,
    val s2: Int = 0,
    val s3: Int = 0,
    val s4: Int = 0,
    val s5: Int = 0,
    val total: Int = 0,
    val pr: Double = 0.0
)
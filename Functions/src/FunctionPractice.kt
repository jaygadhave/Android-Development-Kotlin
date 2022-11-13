fun main(args: Array<String>) {
//    println("Enter Your Name")
//    val a = readLine() ?: ""
//    println("Enter Your Birth Year")
//    val b = readLine() ?: ""
//    val byear = b.toInt()
//
//    countAge(a, byear)

    val list = arrayListOf<String>("A", "B", "C", "D", "E", "F", "G")

    printList(list)

}

fun printList(list: ArrayList<String>) {

    for (i in list)
    {
        println(i)
    }
}

//fun countAge(name: String, bYear: Int) {
////2001 2021
//    val age=2021-bYear
//    println("Your Name is $name and Your Age is ${age-1}")
//
//}


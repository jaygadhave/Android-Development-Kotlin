fun main(args: Array<String>) {
    val a = exampleClass(s = "Jenil", i = 19, d = 20.0)
    val ans = a.sum(10, 60)
    println(ans)
}

class exampleClass(s: String, i: Int, d: Double) {

    fun sum(valu1: Int, value2: Int): Int {
        return valu1 + value2
    }

}
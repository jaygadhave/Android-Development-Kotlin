import java.lang.Exception

fun main(args: Array<String>) {

    val a: String? = "Jenil"

    try {
        println(a!!.length)
    } catch (e: Exception) {
        println("Error Msg is $e")
    }finally {
        println("code running...")
    }
}
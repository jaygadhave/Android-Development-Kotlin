import javax.naming.Name

fun main(args: Array<String>) {

    val a=Names()
    a.vipin()

}

class Names() {

    lateinit var name: String

    fun jenil() {
        name = "Jenil"
        println("My name is $name")
    }

    fun vipin() {
        name = "Vipin"
        println("My name is $name")

    }

    fun Shubham() {
        name = "Shubham"
        println("My name is $name")

    }

}
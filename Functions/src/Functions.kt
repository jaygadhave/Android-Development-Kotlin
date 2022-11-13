fun main(args: Array<String>) {

    example(20)

    example(3, 5)
}

fun example(one: Int) {
    println("$one")
}

fun example(one: Int, two: Int) {
    println("$two == $one")
}
fun main(args: Array<String>) {

    val a:String?= readLine()?:""
    val b = 20

    println(a?.toInt()?.plus(b))

    println(a?.toInt()?.minus(b))

    println(a?.toInt()?.times(b))

}
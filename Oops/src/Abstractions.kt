fun main(args: Array<String>) {

    val a = sum(10)
    val b = mul(10)
//    println(a.calculation())
//    println(a.dataPrinting())
//
//    println(b.calculation())
//    println(b.dataPrinting())

    val arr = arrayOf(a,b,a,b)

    for (obj in arr)
    {
        if (obj is sum)
        {
           val ans= obj.calculation()
            println(ans)
        }
    }

}

abstract class parent() {
    abstract fun dataPrinting()
    abstract fun calculation(): Int
}

class sum(val value1: Int) : parent() {
    override fun dataPrinting() {
        println("sum is getting print")
    }

    override fun calculation(): Int {
        return value1 + value1
    }

}

class mul(val value1: Int) : parent() {
    override fun dataPrinting() {
        println("mul is getting print")
    }

    override fun calculation(): Int {
        return value1 * value1
    }
}
fun main(args:Array<String>){
    println("Enter value: ")
    val a=readLine()?:""
    val b=a.toBoolean()
    println(b::class.java)
}
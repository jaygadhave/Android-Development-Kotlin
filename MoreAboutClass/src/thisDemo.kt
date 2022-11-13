fun main(args: Array<String>) {

    val a = DemoClass()
    println(a.name)
    a.newFunction("Jenil Vaghani")
    println(a.name)
}

class DemoClass() {

    var name: String = "No Name"

    fun newFunction(names: String) {
        //names -> jenil vaghani
        this.name=names
    }
}

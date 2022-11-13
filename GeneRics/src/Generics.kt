fun main(args: Array<String>) {

    val name = data<Int>()
    name.getlenght(1510)

    val list = data<ArrayList<String>>()
    list.getlenght(arrayListOf("a", "b", "c", "d", "e", "f", "g", "h"))

}

class data<T> {
    fun getlenght(item: T) {
        println(item.toString().length)
    }   
}
fun main(args: Array<String>) {

    val student1: Student = getStudent()
    student1.readBook("Rich Dad Poor Dad")
    student1.reading()
    student1.writing()
    
}

interface Student {
    val name: String
    fun reading()
    fun writing()
    fun readBook(bookName: String) {
        println("Student is Reading $bookName Book")
    }
}

class Ramesh : Student {
    override val name: String = "Example Book"

    override fun reading() {
        println("Student is Reading")
    }

    override fun writing() {
        println("Student is Writing")
    }

}

fun getStudent(): Student {
    return Suresh()
}

class Suresh : Student {
    override val name: String = "Example Book"

    override fun reading() {
        println("Student is Reading")
    }

    override fun writing() {
        println("Student is Writing")
    }

}

fun main(args: Array<String>) {
    val customer1:Hotel = French()
    customer1.food()
}

interface Hotel {
    fun food()
}

class IndianHotel : Hotel {
    override fun food() {
        println("Indian Food is Available")
    }
}

class ChineseHotel : Hotel {
    override fun food() {
        println("Chinese Food is Available")
    }
}

class French : Hotel {
    override fun food() {
        println("French Food is Available")
    }
}


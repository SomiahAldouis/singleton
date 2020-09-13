object Singleton {
    init {
        println("Singleton initialized")
    }

    var message = "page number 1"

    fun showMessage() {
        println(message)
    }
}

class Test {
    init {
        Singleton.showMessage()
    }
}

fun main() {
    Singleton.showMessage()

    Singleton.message = "page number 2"
    val test = Test()
    
}

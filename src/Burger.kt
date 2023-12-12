
var burgerMenu = ArrayList<String>()

abstract class Burger {
    abstract val recommend: Int
    abstract val name: String
    abstract val price : Double
    abstract val details : String

    init {

    }

    fun displayInfo() {
        println("$recommend. $name     | W $price | $details")
    }

}
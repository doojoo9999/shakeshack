abstract class DisplayInfoMenu {
    abstract val recommend: Int
    abstract val name: String
    abstract val price : Double
    abstract val details : String
    abstract val category : String

    fun displayInfo() {
        println(String.format("%-1d. %-32s | W %-4.1f | %s", recommend, name, price, details))
    }

}
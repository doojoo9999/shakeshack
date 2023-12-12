class MenuBurger {
    fun burgerMenu() {
        val shackburger = Shackburger()
        val smokeshack = Smokeshack()
        val mushroomsburger = Mushroomburger()
        val cheeseburger = Cheeseburger()
        val hamburger = Hamburger()

        println("[ Burgers MENU ]")
        shackburger.displayInfo()
        smokeshack.displayInfo()
        mushroomsburger.displayInfo()
        cheeseburger.displayInfo()
        hamburger.displayInfo()
    }
}
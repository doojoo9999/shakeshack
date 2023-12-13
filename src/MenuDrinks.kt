class MenuDrinks : Menu() {

    override var menuList = ArrayList<Menu>()

    override fun createMenuList(): List<Menu> {
        return listOf(
            RaspberryLemonade(),
            Lemonade(),
            FreshBrewedIcedTea(),
            FountainSoda(),
            ShackCoffee()
        )
    }

    init {
        menuList.addAll(createMenuList())
    }
}
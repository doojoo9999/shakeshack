class MenuDrinks : Menu() {
    override val menuList: List<DisplayInfoMenu> = createMenuList()
    private fun createMenuList(): List<DisplayInfoMenu> {
        return listOf(
            RaspberryLemonade(),
            Lemonade(),
            FreshBrewedIcedTea(),
            FountainSoda(),
            ShackCoffee()
        )
    }
}

//    override var menuList = ArrayList<Menu>()
//
//    override fun createMenuList(): List<DisplayInfoMenu> {
//        return listOf(
//            RaspberryLemonade(),
//            Lemonade(),
//            FreshBrewedIcedTea(),
//            FountainSoda(),
//            ShackCoffee()
//        )
//    }
//
//    init {
//        menuList.addAll(createMenuList())
//    }
//}
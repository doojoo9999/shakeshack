import MenuList.AbitaRootBeer

class MenuBeers : Menu() {
    override val menuList: List<DisplayInfoMenu> = createMenuList()
    private fun createMenuList(): List<DisplayInfoMenu> {
        return listOf(
            AbitaRootBeer()
        )
    }
}
//    override var menuList = ArrayList<Menu>()
//
//    override fun createMenuList(): List<DisplayInfoMenu> {
//        return listOf(
//            MenuList.AbitaRootBeer()
//        )
//    }
//
//    init {
//        menuList.addAll(createMenuList())
//    }
//}
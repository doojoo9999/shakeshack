import MenuList.*

class MenuFrozenCustard : Menu() {
    override val menuList: List<DisplayInfoMenu> = createMenuList()
    private fun createMenuList(): List<DisplayInfoMenu> {
        return listOf(
            VanillaCookiesnCreamShake(),
            MintCookiesnCreamShake(),
            ClassicHandSpunShake(),
            Floats(),
            CupnCones()
        )
    }
}

//    override var menuList = ArrayList<Menu>()
//
//    override fun createMenuList(): List<DisplayInfoMenu> {
//        return listOf(
//            MenuList.VanillaCookiesnCreamShake(),
//            MenuList.MintCookiesnCreamShake(),
//            MenuList.ClassicHandSpunShake(),
//            MenuList.Floats(),
//            MenuList.CupnCones()
//        )
//    }
//
//    init {
//        menuList.addAll(createMenuList())
//    }
//}
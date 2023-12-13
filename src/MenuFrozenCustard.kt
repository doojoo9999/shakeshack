class MenuFrozenCustard : Menu() {

    override var menuList = ArrayList<Menu>()

    override fun createMenuList(): List<Menu> {
        return listOf(
            VanillaCookiesnCreamShake(),
            MintCookiesnCreamShake(),
            ClassicHandSpunShake(),
            Floats(),
            CupnCones()
        )
    }

    init {
        menuList.addAll(createMenuList())
    }
}
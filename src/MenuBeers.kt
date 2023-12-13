class MenuBeers : Menu() {

    override var menuList = ArrayList<Menu>()

    override fun createMenuList(): List<Menu> {
        return listOf(
            AbitaRootBeer()
        )
    }

    init {
        menuList.addAll(createMenuList())
    }
}
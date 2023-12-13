abstract class Menu {

    abstract val menuList: ArrayList<Menu>

    abstract fun createMenuList(): List<Menu>

    fun displayMenu() {
        println("[ ${this.menuList} MENU ]")
        menuList.forEach { this ->
            this.displayInfo()
        }
    }
}


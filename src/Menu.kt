abstract class Menu {

    abstract val menuList: List<DisplayInfoMenu>

    fun displayMenu() {
        val menuType = this.javaClass.simpleName
        println("[ $menuType MENU ]")
        menuList.forEach { it.displayInfo() }
        println("0. 뒤로 가기")
    }



//    abstract val menuList: ArrayList<Menu>
//
//    abstract fun createMenuList(): List<Menu>
//
//    fun displayMenu() {
//        println("[ ${this.menuList} MENU ]")
//        menuList.forEach { this ->
//            this.displayInfo()
//        }
//    }
}


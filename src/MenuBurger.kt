class MenuBurger : Menu() {

    override val menuList: List<DisplayInfoMenu> = createMenuList()
    private fun createMenuList() : List<DisplayInfoMenu> {
        return listOf(
            Shackburger(),
            Smokeshack(),
            Mushroomburger(),
            Cheeseburger(),
            Hamburger()
        )
    }


//    override var menuList = ArrayList<Menu>()

//    override fun createMenuList() : List<DisplayInfoMenu> {

//    init {
//        menuList.addAll(createMenuList())
//    }


//    fun burgerMenu() {
//        val shackburger = Shackburger()
//        val smokeshack = Smokeshack()
//        val mushroomsburger = Mushroomburger()
//        val cheeseburger = Cheeseburger()
//        val hamburger = Hamburger()

//        println("[ Burgers MENU ]")
//
//        burgerList.forEach { burger ->
//            burger.displayInfo()
//        }

//        shackburger.displayInfo()
////      burgerList.forEach {burger ->
////                println(burger.recommend.toString() + ". " + burger.name + "     |" + burger.price + "      ㅣ" + burger.details)
////            }
////        }


//        smokeshack.displayInfo()
//        mushroomsburger.displayInfo()
//        cheeseburger.displayInfo()
//        hamburger.displayInfo()
   }

    // 어쨋든 불러오는 데에는 성공했다. 하지만 이걸 매 번 채워줘야 하는 건 똑같은데 추상 클래스에서 불러올 때
    // 알아서 추가되게끔 할 수 없을까?

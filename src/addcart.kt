class AddCart {

    fun addCart(menuSelect: Int) {
        val burger = MenuBurger().menuList[menuSelect - 1]

        cart.add(dataOrder(menu.recommend, menu.name, menu.price, menu.details, menu.category))

        println("${menu.name}가 장바구니에 추가되었습니다.")


    }


}
class AddCart {

    fun addCart(burgerSelect: Int) {
        val burger = MenuBurger().menuList[burgerSelect - 1]

        cart.add(dataOrder(burger.recommend, burger.name, burger.price, burger.details))

        println("${burger.name}가 장바구니에 추가되었습니다.")
    }


}
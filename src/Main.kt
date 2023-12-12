//TIP Press <shortcut raw="SHIFT"/> twice to open the Search Everywhere dialog and type <b>show whitespaces</b>,
// then press <shortcut raw="ENTER"/>. You can now see whitespace characters in your code.
fun main() {

    println("[SHAKESHACK MENU]")
    println("1. BURGER")
    println("2. Frozen Custard")
    println("3. Drinks")
    println("4. Beers")
    println("0. Quit")


    val selectNumber = readlnOrNull()?.toInt()


    when (selectNumber) {
        1 -> MenuBurger().burgerMenu()

        2 -> MenuFrozenCustard().frozencustardMenu()

        3 -> MenuDrinks().drinksMenu()

        4 -> MenuBeers().beersMenu()

        0 -> println("프로그램을 종료합니다.")

        else -> throw IllegalArgumentException("메뉴를 다시 확인해 주세요.")
    }

}

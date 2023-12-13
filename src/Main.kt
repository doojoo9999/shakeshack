//TIP Press <shortcut raw="SHIFT"/> twice to open the Search Everywhere dialog and type <b>show whitespaces</b>,
// then press <shortcut raw="ENTER"/>. You can now see whitespace characters in your code.
fun main() {

    println("[SHAKESHACK MENU]")
    println("1. BURGER")
    println("2. Frozen Custard")
    println("3. Drinks")
    println("4. Beers")
    println("0. Quit")

    while(true) {
        try {
            val selectNumber = readlnOrNull()?.toInt()
            when (selectNumber) {
                1 -> MenuBurger().displayMenu()

                2 -> MenuFrozenCustard().displayMenu()

                3 -> MenuDrinks().displayMenu()

                4 -> MenuBeers().displayMenu()

                0 -> println("프로그램을 종료합니다.")

            }
        } catch (e: java.lang.NumberFormatException) {
            println("메뉴를 확인하신 뒤 숫자를 다시 입력해 주세요.")
        }
    }


}

//TIP Press <shortcut raw="SHIFT"/> twice to open the Search Everywhere dialog and type <b>show whitespaces</b>,
// then press <shortcut raw="ENTER"/>. You can now see whitespace characters in your code.

val cart = mutableListOf<dataOrder>()

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
                1 -> {
                    MenuBurger().displayMenu()
                    val burgerSelect = readlnOrNull()?.toInt()
                    when (burgerSelect) {
                        1 -> AddCart().addCart(burgerSelect)
                        2 -> AddCart().addCart(burgerSelect)
                        3 -> AddCart().addCart(burgerSelect)
                        4 -> AddCart().addCart(burgerSelect)
                        5 -> AddCart().addCart(burgerSelect)
                        0 -> {
                            println("뒤로 가기")
                            return main()
                        }
                        else -> println("메뉴를 확인하신 뒤 숫자를 다시 입력해 주세요.")
                    }
                }

                2 -> {
                    MenuFrozenCustard().displayMenu()
                    val frozenCustardSelect = readlnOrNull()?.toInt()
                    when (frozenCustardSelect) {
                        1 -> AddCart().addCart(frozenCustardSelect)
                        2 -> AddCart().addCart(frozenCustardSelect)
                        3 -> AddCart().addCart(frozenCustardSelect)
                        4 -> AddCart().addCart(frozenCustardSelect)
                        5 -> AddCart().addCart(frozenCustardSelect)
                        0 -> {
                            println("뒤로 가기")
                            return main()
                        }
                        else -> println("메뉴를 확인하신 뒤 숫자를 다시 입력해 주세요.")
                    }
                }
                3 -> {
                    MenuDrinks().displayMenu()
                    val drinksSelect = readlnOrNull()?.toInt()
                    when (drinksSelect) {
                        1 -> AddCart().addCart(drinksSelect)
                        2 -> AddCart().addCart(drinksSelect)
                        3 -> AddCart().addCart(drinksSelect)
                        4 -> AddCart().addCart(drinksSelect)
                        5 -> AddCart().addCart(drinksSelect)
                        0 -> {
                            println("뒤로 가기")
                            return main()
                        }
                        else -> println("메뉴를 확인하신 뒤 숫자를 다시 입력해 주세요.")
                    }
                }

                4 -> {
                    MenuBeers().displayMenu()
                    val beersSelect = readlnOrNull()?.toInt()
                    when (beersSelect) {
                        1 -> AddCart().addCart(beersSelect)
                        2 -> AddCart().addCart(beersSelect)
                        3 -> AddCart().addCart(beersSelect)
                        4 -> AddCart().addCart(beersSelect)
                        5 -> AddCart().addCart(beersSelect)
                        0 -> {
                            println("뒤로 가기")
                            return main()
                        }
                        else -> println("메뉴를 확인하신 뒤 숫자를 다시 입력해 주세요.")
                    }
                }


                0 -> {
                    println("프로그램을 종료합니다.")
                    break
                }

                else -> println("메뉴를 확인하신 뒤 숫자를 다시 입력해 주세요.")

            }
        } catch (e: java.lang.NumberFormatException) {
            println("메뉴를 확인하신 뒤 숫자를 다시 입력해 주세요.")
        }
    }

}


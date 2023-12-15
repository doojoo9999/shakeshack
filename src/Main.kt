import MenuList.MenuFrozenCustard

//TIP Press <shortcut raw="SHIFT"/> twice to open the Search Everywhere dialog and type <b>show whitespaces</b>,
// then press <shortcut raw="ENTER"/>. You can now see whitespace characters in your code.

val cart = mutableListOf<dataOrder>()

fun main() {


    println("SHAKESHACK BURGER에 오신 것을 환영합니다.")
    println("메뉴판을 보시고 메뉴를 골라 입력해 주세요.")

    println("[SHAKESHACK MENU]")
    println(String.format("%-1s. %-32s | %s ","1", "Burgers", "앵거스 비프 통살을 다져 만든 버거."))
    println(String.format("%-1s. %-32s | %s ","2", "Forzen Custard", "매장에서 신선하게 만드는 아이스크림."))
    println(String.format("%-1s. %-32s | %s ","3", "Drinks", "매장에서 직접 만드는 음료."))
    println(String.format("%-1s. %-32s | %s ","4", "Beer", "뉴욕 브루클린 브루어리에서 양조한 맥주"))
    println()
    println("[ ORDER MENU ]")
    println(String.format("%-1s. %-32s | %s ","5", "Order", "장바구니를 확인한 후 주문합니다."))
    println(String.format("%-1s. %-32s | %s ","6", "Cancle", "진행 중인 주문을 취소합니다."))



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

                5 -> {
                    val callcart = OrderCart()
                    callcart.orderCart()
                }

                6 -> {
                    println("프로그램을 종료합니다.")
                 break
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


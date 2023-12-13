class OrderMenu {

    fun orderMenu() {
        println("[ ORDER MENU ]")
        println(String.format(" %-1s. %-32s | W %-4.1f | %s", "5", "Order", "장바구니를 확인한 후 주문합니다."))
        println(String.format(" %-1s. %-32s | W %-4.1f | %s", "6", "Order", "장바구니를 확인한 후 주문합니다."))

        var orderCheck = readLine()?.toInt()


    }

}
class OrderMenu {

    fun orderMenu() {


        // 이걸 만들어 놓긴 했는데 언제 써야될 지 모르겠다..
        println(String.format("%-1s. %-32s | %s ","5", "Order", "장바구니를 확인한 후 주문합니다."))
        println(String.format("%-1s. %-32s | %s ","6", "Cancle", "진행 중인 주문을 취소합니다."))

        var orderCheck = readLine()?.toInt()

    }

}
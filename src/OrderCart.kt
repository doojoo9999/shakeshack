import kotlin.math.truncate

class OrderCart {

    fun orderCart() {

        ShowCart().showCart()

        println("장바구니에 담긴 햄버거들을 주문하시겠습니까?")
        println("1. 확인")
        println("2. 취소")

        while (true) {
            val answer = readlnOrNull()?.toInt()

            when (answer) {
                1 -> {
                    if (cart.isEmpty()) {
                        println("장바구니가 비어있습니다.")
                        println("메인 화면으로 돌아갑니다.")
                    } else {
                        println("[ category Orders ]")
                        println("주문이 완료되었습니다. 감사합니다.")
                        cart.clear()
                        break
                    }
                }

                2 -> {
                    println("주문이 취소되었습니다. 다시 선택해주세요.")
                }

                else -> {
                    println("잘못된 입력입니다. 1 또는 2을 입력해주세요.")
                }
            }
        }

    }
}
class ShowCart {

    val cart = mutableListOf<dataOrder>()
            fun showCart() {
            // 장바구니에 담긴 햄버거들의 개수를 출력합니다.
            println("장바구니에는 총 ${cart.size}개의 햄버거가 있습니다.")
            // 장바구니에 담긴 햄버거들의 정보를 출력합니다.
            cart.forEach { println(it) }
            // 장바구니에 담긴 햄버거들의 총 가격을 계산하고 출력합니다.
            val totalPrice = cart.sumOf { it.price }
            println("장바구니에 담긴 햄버거들의 총 가격은 ${totalPrice}원입니다.")
        }
    }


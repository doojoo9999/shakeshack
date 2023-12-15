class ShowCart {

    val cart = mutableListOf<dataOrder>()
            fun showCart() {

            println("장바구니에는 총 ${cart.size}개의 햄버거가 있습니다.")

            cart.forEach { println(it) }

            val totalPrice = cart.sumOf { it.price }
            println("장바구니에 담긴 햄버거들의 총 가격은 ${totalPrice}원입니다.")
        }
    }


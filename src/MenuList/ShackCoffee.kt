package MenuList

import DisplayInfoMenu

class ShackCoffee : DisplayInfoMenu() {
    override val recommend : Int
        get() = 5
    override val name : String
        get() = "Shack Coffee"

    override val price : Double
        get() = 6.4

    override val details : String
        get() = "쉑 블렌드 원두를 사용한 밸런스 좋은 블랙 커피(일부 점포)"

}
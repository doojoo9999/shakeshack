package MenuList

import DisplayInfoMenu

class RaspberryLemonade : DisplayInfoMenu() {
    override val recommend : Int
        get() = 1
    override val name : String
        get() = "Raspberry MenuList.Lemonade"

    override val price : Double
        get() = 4.8

    override val details : String
        get() = "쉐이크쉑 시그니처 레몬에이드에 상큼 달콤한 라즈베리가 더해진 시즌 한정 레몬에이드"

    override val category : String
        get() = "Drink"
}
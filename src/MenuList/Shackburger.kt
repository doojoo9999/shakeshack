package MenuList

import DisplayInfoMenu

class Shackburger : DisplayInfoMenu() {

    override val recommend : Int
        get() = 1
    override val name : String
        get() = "MenuList.Shackburger"

    override val price : Double
        get() = 6.9

    override val details : String
        get() = "토마토, 양상추, 쉑소스가 토핑된 치즈버거"
}
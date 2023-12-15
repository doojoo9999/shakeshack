package MenuList

import DisplayInfoMenu

class Smokeshack : DisplayInfoMenu(){

    override val recommend: Int
        get() = 2
    override val name : String
        get() = "MenuList.Smokeshack"

    override val price : Double
        get() = 8.9

    override val details : String
        get() = "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈"
}
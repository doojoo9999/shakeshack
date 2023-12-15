package MenuList

import DisplayInfoMenu

class FountainSoda : DisplayInfoMenu() {
    override val recommend : Int
        get() = 4
    override val name : String
        get() = "Fountain Soda"

    override val price : Double
        get() = 2.9

    override val details : String
        get() = "코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프, 환타 파인애플"
}
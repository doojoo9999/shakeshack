package MenuList

import DisplayInfoMenu

class VanillaCookiesnCreamShake : DisplayInfoMenu() {

    override val recommend : Int
        get() = 1
    override val name : String
        get() = "Vanilla Cookies & Cream Shake"

    override val price : Double
        get() = 7.5

    override val details : String
        get() = "부드러운 바닐라 커스터드와 바삭한 쿠키 크럼블이 어우러진 홀리데이 쉐이크"
}
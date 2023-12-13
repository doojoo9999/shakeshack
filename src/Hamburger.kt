class Hamburger : DisplayInfoMenu(){

    override val recommend : Int
        get() = 5
    override val name : String
        get() = "Hamburger"
    override val price : Double
        get() = 5.4

    override val details : String
        get() = "비프패티를 기반으로 야채가 들어간 기본버거"
}
class Lemonade : Drinks() {
    override val recommend : Int
        get() = 2
    override val name : String
        get() = "Lemonade"

    override val price : Double
        get() = 4.3

    override val details : String
        get() = "매장에서 직접 만드는 상큼한 레몬에이드"
}
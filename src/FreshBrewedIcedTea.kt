class FreshBrewedIcedTea : Drinks() {
    override val recommend : Int
        get() = 3
    override val name : String
        get() = "Fresh Brewed Iced Tea"

    override val price : Double
        get() = 3.5

    override val details : String
        get() = "직접 유기농 홍차를 우려낸 아이스 티"
}
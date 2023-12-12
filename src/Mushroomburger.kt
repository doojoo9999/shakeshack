class Mushroomburger : Burger(){

    override val recommend: Int
        get() = 3
    override val name : String
        get() = "MushroomBurger"

    override val price : Double
        get() = 9.4

    override val details : String
        get() = "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"
}
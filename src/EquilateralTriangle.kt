import kotlin.math.sqrt

class EquilateralTriangle(_name: String) : Shape(_name) {
    private var side: Double=0.0
    init {
        name = _name
    }
    fun setDimension(_side: Double){
        this.side = _side
    }

    override fun printDimensions() {
        println("EquilateralTriangle Dimensions are: $side,$side, $side")
    }

    //area = √ (s (s-a) (s-b) (s-c))
    override fun getArea(): Double {
        val s=(side *3) / 2
        return sqrt(s*(s-side)*(s-side)*(s-side))
    }

}
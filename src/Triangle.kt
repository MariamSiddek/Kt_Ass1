import kotlin.math.sqrt
class Triangle(_name: String) : Shape(_name) {
    private var side1: Double=0.0
    private var side2: Double=0.0
    private var side3: Double=0.0

    init {
        name = _name
    }
    fun setDimension(_side1: Double, _side2: Double, _side3: Double) {
         this.side1 = _side1
         this.side2 = _side2
         this.side3 = _side3
    }

    override fun printDimensions() {
        println("Triangle Dimensions are: 3 sides = $side1, $side2, $side3")
    }

    //area = √ (s (s-a) (s-b) (s-c))
    override fun getArea(): Double {
        val s=(side1 + side2 + side3) / 2
        return sqrt(s*(s-side1)*(s-side2)*(s-side3))
    }
}
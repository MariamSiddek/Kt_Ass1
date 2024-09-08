import kotlin.time.times

class Square(_name: String) : Shape(_name) {
    private var length: Double = 0.0
    private var height: Double = 0.0

    init {
        name = _name
    }
    fun setDimension(_length: Double, _height: Double){
        this.height = _height
        this.length = _length
    }

    override fun printDimensions() {
        println("Square Dimensions are: length = $length, height= $height")
    }

    override fun getArea(): Double {
        return length*height
    }

}
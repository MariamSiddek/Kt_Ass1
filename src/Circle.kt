class Circle(_name: String) : Shape(_name) {
    private var radius: Double = 0.0

    init {
        name = _name
    }
    fun setDimension(_radius: Double){
        this.radius = _radius
    }

    override fun printDimensions() {
        println("Circle Dimensions is: $radius ")
    }

    override fun getArea(): Double {
         val pi: Double =3.142857142857143
        return pi*radius*radius
    }


}
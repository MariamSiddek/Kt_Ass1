import java.util.Scanner
fun main() {
    val square=Square("Square")
    val triangle=Triangle("Triangle")
    val circle=Circle("Circle")
    val equilateralTriangle=EquilateralTriangle("EquilateralTriangle")

    val reader = Scanner(System.`in`)
    println("Welcome to Shape Area Calculator")
    println()
    println("1- Square")
    println("Enter the dimensions of the square")
    println("Length: ")
    var lengthOfSquare:Double = reader.nextDouble()
    println("Height:")
    var heightOfSquare = reader.nextDouble()
    square.setDimension(lengthOfSquare,heightOfSquare)
    square.printDimensions()
    println("The area of the square is: "+ square.getArea())
    repeat(3) { println() }
    ////////////////////////////////////////////////////
    println("2- Circle")
    println("Enter the dimensions of the circle")
    println("Radius:")
    var radius:Double = reader.nextDouble()
    circle.setDimension(radius)
    circle.printDimensions()
    println("The area of the circle is: "+ circle.getArea())
    repeat(3) { println() }
    /////////////////
    println("3- Triangle")
    println("Enter the dimensions of the triangle")
    println("side 1: ")
    var side1:Double = reader.nextDouble()
    println("side2:")
    var side2:Double = reader.nextDouble()
    println("side3:")
    var side3:Double = reader.nextDouble()
    triangle.setDimension(side1, side2, side3)
    triangle.printDimensions()
    println("The area of the triangle is: "+ triangle.getArea())

    repeat(3) { println() }
    /////////////////////////////////////////////////////////////////////////
    println("4- EquilateralTriangle")
    println("Enter the dimensions of the equilateralTriangle ")
    println("side length: ")
    var side:Double = reader.nextDouble()
    equilateralTriangle.setDimension(side)
    equilateralTriangle.printDimensions()
    println("The area of the equilateralTriangle is: "+ equilateralTriangle.getArea())

}
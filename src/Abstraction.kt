//fun main(){
//    val abstraction = Abstraction(4.0)
//  println(abstraction.area())
//  abstraction.display()
//}
//
//abstract class ShapeEx{
//    var name:String = ""
//    abstract fun area() :Double
//    abstract fun display()
//}
//
//class Abstraction(val radius: Double): ShapeEx() {
//    override fun area(): Double = Math.PI * radius * radius
//     override fun display() {
//        println("Circle is getting displayed")
//    }
//}

//fun main()
//{
//    val shapes = arrayOf(Circle1(4.0), Square1(4.0), Triangle1(2.0, 3.0))
//    dragObjects(shapes)
//}
//
//fun <T : Shape1> dragObjects(objects: Array<T>) {
//    for (obj: T in objects) {
//        obj.drag()
//    }
//}
//
//abstract class Shape1 {
//    abstract fun area() : Double
//    abstract fun drag()
//}
//
//class Circle1(val radius:Double): Shape1(){
//    override fun area(): Double = Math.PI * radius * radius
//    override fun drag() = println("Circle is dragging")
//}
//class Square1(val side: Double): Shape1() {
//    override fun area(): Double = side * side
//    override fun drag() = println("square is dragging")
//}
//class Triangle1(val base: Double, val height:Double): Shape1(){
//    override fun area(): Double = 0.5 * base * height
//    override fun drag() = println("Triangle is dragging")
//}
//class Player(val name: String){
//    fun drag() = println("$name is dragging")
//}

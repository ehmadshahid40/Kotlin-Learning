fun main()
{
    val shapes = arrayOf(Circle1(4.0), Square1(4.0), Triangle1(2.0, 3.0), Player("Hello"))
    dragObjects(shapes)
}


//fun dragObjects(objects: Array<Any>) {
//    for (obj: Draggable in objects) {
//        obj.drag()
//
//    }

fun <T : Draggable> dragObjects(objects: Array<T>) {
    for (obj: Draggable in objects) {
        obj.drag()
    }
}
interface Draggable{
    fun drag()
}


    abstract class Shape1:Draggable {
        abstract fun area(): Double
    }

    class Circle1(private val radius: Double) : Shape1() {
        override fun area(): Double = Math.PI * radius * radius
        override fun drag() = println("Circle is dragging")
    }

    class Square1(private val side: Double) : Shape1() {
        override fun area(): Double = side * side
        override fun drag() = println("square is dragging")
    }

    class Triangle1(private val base: Double, private val height: Double) : Shape1() {
        override fun area(): Double = 0.5 * base * height
        override fun drag() = println("Triangle is dragging")
    }

    class Player(private val name:String):Draggable{
       override fun drag() = println("$name is in player function")

    }


//fun main()
//{
//   val circlee = Circlee(4.0)
//   val player = Player("Hello")
//
//    val arr:Array<Any> = arrayOf(circlee,player)
//for(obj:Any in arr){
//    if(obj is Circle){
//        println(obj.area())
//    }
//    else
//    {
//        (obj as Player).sayMyName()
//    }
//}
//}
//interface Draggable{
//    fun dragg()
//}
//
//abstract class Shapee:Draggable{
//    abstract fun area():Double
//}
//
//class Circlee(val radius:Double):Shapee(){
//    override fun area():Double = Math.PI*radius*radius
//    override fun dragg() = println("Circle is dragging")
//}
//
//class Player(val name:String):Draggable{
//    override fun dragg() = println("$name is dragging")
//    fun sayMyName() = println("Hey my name is $name")
//}
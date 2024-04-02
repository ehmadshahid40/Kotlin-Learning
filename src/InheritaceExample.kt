fun main()
{
   val basic = BasicPhone()
    println(basic.getScreenInfo())
    println(basic.name)


    val smartphone = SmartPhone()
    println(smartphone.valume)
    println(smartphone.playMovie())
}
open class phone{
    init {
        println("parent class is called")
    }
        val name: String = "nokia"
        val type: String = ",,,,,"
        val valume:Int = 10

        fun makeCall() {}
        fun display() {}
}
class BasicPhone: phone(){
    init {
        println("child class is called")
    }
    fun getScreenInfo() {println("Basic Class")}
}


class SmartPhone: phone(){
    fun playMovie() {println("SmartPhone Class")}
    fun getLocation() {println("...........")}
}

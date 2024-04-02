fun main(){
  val oneplus = OnePlus("smartPhone")
    println(oneplus.display())
    println(oneplus.makeCall())
    println(oneplus.toString())
}

open class Mobile(val type:String)  {
    open val name: String = ""
    open val size: Int = 5
    open fun makeCall() = println("calling from Mobile")
    open fun display() = println("Simple Mobile Display")
}


    class OnePlus(typeparam: String) : Mobile(typeparam) {
        override val name: String = "one+"
        override val size:Int = 6
        override fun display() {
            println("One+ Display")
            fun makeCall() {
                super.makeCall()
                println("calling from one+")
            }
        }
        override fun toString():String
        {
            return "Name - $name - Size - $size"
        }
    }


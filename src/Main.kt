//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   var one: Byte
   var two: Short
   var three: Int
   var four: Long
   var five: Float
   var six: Double
   var seven: Boolean
   var eight: Char
   var nine: String

   var a: Int
   var b: Int

   println("Greater Number :${Programs.returnGreater(2,3,6)}")
   //val ret = When.WhenCheck("lion")
  // println(ret)
   println("your ... :${When.WhenCheck(6.toString())}")

   function(24)

   addition(3,7)

   defaultArgument(3)

   println("Default Arguments:")
   defaultArgument()

   val fn:(a:Int,b:Int)->Int= :: addition
   println("Function in a variable:")
   println(fn(4,4))

   aryEx()

   var person1 = Example("danish",101,"math")
   person1.example()

   var person2 = Person("hazik",18)
   println(person2.canVote())
   person2.name1 = "hameed"
   person2.age1 = -21
   println(person2.name1)

}

//function example
 fun function(number: Int):Unit {
   val result = if (number % 2 == 0) "Even" else "Odd"
   println(result)
}
//inline function
fun addition(firstnumber: Int, secondnumber: Int) = firstnumber + secondnumber
//Default Argument
fun defaultArgument(count: Int = 2) {
   for(i in 1..count)
   {
      println("$i: Hello")
   }
}
//Array function
fun aryEx(){
   var arr = arrayOf("one","two","three")
   arr.set(1,"hello")
   for((i,e) in arr.withIndex())
   {
      println("$i - $e")
   }
}

//class
//class Example
//{
//
//   constructor(name: String, roll: Int) {
//
//         println(name)
//         println(roll)
//
//   }
//}

class Example(var name:String,roll:Int,var Subj:String)
{
   val roll_no = "my roll no is $roll"
   fun example(temp:String = "hi"){
      println(name)
      println(roll_no
       )
   }
}


class Person(name:String,age:Int) {
   var name1 = name
      get()
      {
         return field.toUpperCase()
      }

   init {
      println("$name1 is created")
   }

   var age1 = age
      set(value){
         if(value > 0)
         {
            field = value
         }
         else
         {
            println("age cant be -ve")
         }
      }

   init {
      println("2nd initializer block is created")
   }

   fun canVote(): Boolean {
      return age1 > 18
   }
}




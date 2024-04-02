object When {
    fun WhenCheck(number: String): String {
//        //simple when example
//        when(Animal){
//           "hourse" -> return "animal is horse"
//           "cow" -> return "animal is cow"
//           "dog" -> return "animal is Dog"
//           else -> return "it is not animal"


        //when as an expresion
//        var result = when (Animal) {
//            "cat" -> "Animal is cat"
//            "cow" -> "Animal is cow"
//            "horse" -> "Animal is horse"
//            else -> "It is not Animal"
//        }
//        return result

        //when as an Range
        var result = when(number){
            1.toString() -> "one"
            3.toString() -> "three"
            in 3.toString().. 7.toString() -> "between 3 to 7"
            else -> "number is not found"
        }
        return result
    }
}
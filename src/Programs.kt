object Programs {


    fun returnGreater(firstNumber: Int, secondNumber: Int, thirdNumber: Int): Int {


        if(firstNumber > secondNumber && firstNumber > thirdNumber){
            return firstNumber
        }
        else if(secondNumber > firstNumber && secondNumber > thirdNumber)
        {
            return secondNumber
        }
        else
        {
            return thirdNumber
        }
    }


}
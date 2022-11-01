fun  IfElseExpression(){
    val number = -50
    val result = if (number>0){
        println("Positive number")
    }else{
        print("Negative number")
    }
}

fun  IfElesExpression2(){
    val remain = 1
    val result = if(remain>0) "มีสินค้า" else "สินค้าหมด"
        println(result)
}

fun  IfElesExpression3(){
    val number = 60

    val result = if(number<0)"Negative number"
    else if(number in 0..9) "Single digit number"
    else if(number in 10..99 )"Double digit number"
    else "number has more digits"
    println(result)
}

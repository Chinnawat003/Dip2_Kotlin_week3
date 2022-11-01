fun IfElseStatement(){
    var balance = 30_000
    val withdraw = 2_550

    if(balance<withdraw){
        println("ยอดเงินคงเหลือ")
    }else if (withdraw>20_000){
        println("ถอนไม่เกิน 20000 บาท")
    }else if (withdraw % 100 != 0){
       println("ต้องจำนวนเต็มร้อยเท่านั้น")
    }
    else{
        balance -= withdraw //balance = balance - withdraw
        print("ยอดเงืนคงเหลือ: $balance บาท")
    }
}
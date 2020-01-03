fun main(args:Array<String>) {
    moreOrLess(2, 3)
}
fun moreOrLess(num1:Int, num2:Int) {
 
   if(num1 > num2) {
       println("$num1 is more than $num2")
    }
    
    else if(num1 < num2) {
        println("$num1 is less than $num2")
    }

}

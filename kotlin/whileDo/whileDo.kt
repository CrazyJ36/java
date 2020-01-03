fun main(args : Array<String>){ 
    matchNumber(5)
} 

fun matchNumber(num: Int){
    var count = 0 
    do { 
        println("$count is not the same as $num")
        count++ 
    } while (num = count) 
        println("$num is the same as $count")
}

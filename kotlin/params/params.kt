fun main(args:Array<String>) {
    printParams("sent this string to printParams() while running printParams from main ")
    printParams("running printParams() again with this different string as a direct argument to printParams str:String arguments in parenthesis")
}
fun printParams(str:String) { 
    println(str)
}    


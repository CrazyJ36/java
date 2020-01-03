fun main(args:Array<String>) {
    println("run with 'y' or 'n' as arguments")
    val x = args[0]
    when (x) {
        "n" -> println("you said no")
        "y" -> println("you said yes")
    }
}

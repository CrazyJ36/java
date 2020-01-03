fun main(args:Array<String>) {
    val warn = "Requires A username as arguments or you get ArrayIndexOutOfBoundsException at arg[0]\n\n"
    println(warn)
    var user = args[0]
    
    if(user.equals("thomas")) {
        println("Welcome Thomas")
    } else {
        println("User not registered")

    }
}

import java.lang.*
import java.util.Arrays

fun main(args:Array<String>) {
    myMenu() }


fun myMenu() {    
    println("Welcome! Type what you want to do: exit or number")
    val x = readLine()
    when (x) {
        "exit" -> sayBye()
        "number" -> stuff()
        else -> myMenu()
    }
}



// Other functions


fun stuff() {
    println("I'll show you A number")
    val y = Math.random()
    println(y)
    myMenu()
}

fun sayBye() {
    println("Bye")
    System.exit(0)
}


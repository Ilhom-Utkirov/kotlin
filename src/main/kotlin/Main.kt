/**
 * @author : Ilhom O'tkirov
 * @created : 15.06.2021, вторник
 **/
 var greeting : String? = " nate"   // now nullable string
 val  name : String = "hello kotlin"    //can be assigned only once

fun main() {
    println("Hello Kotlin")

    val name : String = "namelist"

    println(name)
    println(greeting)

    greeting = null

    println(name)
    println(greeting)

}
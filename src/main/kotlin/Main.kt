/**
 * @author : Ilhom O'tkirov
 * @created : 15.06.2021, вторник
 **/
 var greeting : String? = null   // now nullable string
 val  name : String = "hello kotlin"    //can be assigned only once

fun main() {
    println("start project!!! ")
    val name : String = "namelist"


    when (greeting){  //switch
        null-> println("Hi when it is null")  //case1
        "comon"-> println("when it is comon") //case2
        else-> println(greeting)               //default
    }

    val greetingToPrint = if(greeting != null) greeting else "Hi"

    val greetingToPrint2 =when(greeting){
        null->"Hi"
        else->greeting
    }

    println("name = $name")
    println("greetingToPrint =$greetingToPrint")
    println("greetingToPrint =$greetingToPrint2")


}
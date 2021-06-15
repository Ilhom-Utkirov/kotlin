/**
 * @author : Ilhom O'tkirov
 * @created : 15.06.2021, вторник
 **/
///functions

fun getGreeting1(): String? {
    //return "Hello Kotlin"
    return null
}
fun getGreeting2() = "Hello Kotlin"


fun sayHello(): Unit{
    println(getGreeting1())
}

fun sayHello2(itemToGreet:String){
    val msg = "Hello 2nd time  " + itemToGreet
    println(msg)
}

fun sayHello3(itemToGreet: String, greeting : String) = println("$itemToGreet $greeting")

fun sayHello4(greeting: String, itemsToGreet:List<String>){
    itemsToGreet.forEach { itemToGreet -> println("$greeting $itemToGreet" ) }
}


fun sayHello5(greeting: String, vararg itemsToGreet:String){
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet" ) }
}

fun greetPerson(greeting: String, name:String) = println("$greeting $name")

fun greetPerson2(greeting: String = "Hello", name:String = "Default Kotin") = println("$greeting $name")

 var greeting : String? = null   // now nullable string
 val  name : String = "hello kotlin"    //can be assigned only once




fun main() {
    /*
    //ITERATION
//    val interestingThings = arrayOf("Kotlin", "Programming", "Comic books")
//    println(interestingThings.size)
//    println(interestingThings[0])
//    println(interestingThings.get(0))
//    println("-----------  itereation  -------------")
//    for (interestingThing in interestingThings){
//        println(interestingThing)
//    }
//    println("--------- FOR EACH WITH STANDARD INDEX it ---------------")
//
//    interestingThings.forEach {
//        println(it)
//    }
//    println("---------- FOR EACH VERSION --------------")
//    interestingThings.forEach {interestingThing ->
//        println(interestingThing)
//    }
//    println("---------- FOR EACH with index--------------")
//
//    interestingThings.forEachIndexed { index, interestingThing ->
//        println("$interestingThing is at index$index")
//    }

//    val interestingThings = listOf("Kotlin", "Programming", "Comic books")
//    interestingThings.forEach{interestingThing -> println(interestingThing)}
//
//    val interestingThings2 = mutableListOf("Kotlin", "Programming", "Comic books")
//    interestingThings2.forEach{interestingThing -> println(interestingThing)}
//
//
//
//    val map = mapOf(1 to "a" , 2 to "b", 3 to "c")
//    map.forEach {  key , value -> (println("$key -> $value")) }
//
//    val map2 = mutableMapOf(1 to "a" , 2 to "b", 3 to "c")
//    map.forEach {  key , value -> (println("$key -> $value")) }
//     sayHello4("HI", interestingThings)
//
//
//    println("---------- pass FOR EACH empty list--------------")
//    sayHello4("hi", listOf())
//
//    println("---------- pass FOR EACH vararg--------------")
//    sayHello5("hi", "Kotlin", "Programming", "ComicBooks")
*/
/*
//
//    println("---------- pass FOR array of --------------")
//    val interestingThings = arrayOf("Kotlin", "Programming", "Comic books")
//    sayHello5("Hi", *interestingThings)
*/

    greetPerson2(name= "Hi")

   //val person =Person("Nate", "Oadsti")
    val person =Person( )
    //all of this not needded after one function
    /*
//
//    println(person.firstName)
//    println(person.lastName)
//
//    person.nickname = "Nicknamesli"
//
//    person.nickname = "testALfa"
//    println(person.nickname)
*/

    person.printInfo()


/*
    //FUNCTIONS
//    println("Hello world")
//    println(getGreeting1())
//    println("greeting2 func :" + getGreeting2())
//    sayHello()
//    sayHello2(  "Ktoln")
//    sayHello3("HI Kitlin", "Hello world!!!!!!")



//
//    when (greeting){  //switch
//        null-> println("Hi when it is null")  //case1
//        "comon"-> println("when it is comon") //case2
//        else-> println(greeting)               //default
//    }
//
//    val greetingToPrint = if(greeting != null) greeting else "Hi"
//
//    val greetingToPrint2 =when(greeting){
//        null->"Hi"
//        else->greeting
//    }
//
//    println("name = $name")
//    println("greetingToPrint =$greetingToPrint")
//    println("greetingToPrint =$greetingToPrint2")
*/

}
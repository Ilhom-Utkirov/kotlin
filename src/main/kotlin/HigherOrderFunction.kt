
//fun printFilteredStrings(list: List<String>, predicate: (String) -> Boolean ){
fun printFilteredStrings(list: List<String>, predicate: ((String) -> Boolean)? ){

    list.forEach(){
        //if ( predicate(it) ){
        if ( predicate?.invoke(it) == true ){
            println(it)
        }
    }
}

val pred : (String) ->Boolean = {
    it.startsWith("j")
}

fun getPrintPredicate() : (String) -> Boolean {
    return { it.startsWith("j") }
}

fun main(){
    val list = listOf("Kotlin", "java", "C++", "js", null, null)
    //need to pas func as 2ndparameter to print filters

    //1 way
    //standard way of specifiying the lamda function
    //printFilteredStrings(list, { it.startsWith("K") })

    //2 way
    //lamda can be declared in the outside of the function
//    printFilteredStrings(list){
//         it.startsWith("j")
//    }

    //now null is handled
    //printFilteredStrings(list, null)

    //3rd way
    //lambda can be declared in the outside of the function
    //printFilteredStrings(list, pred)

    //4th way
    //lambda can be returned from function
//    println("with function ")
//    printFilteredStrings(list, getPrintPredicate())

    println("with functional foreach")
    list
        .filterNotNull()
        .filter{
            it.startsWith("j")
        }
        // map will take any previous type is but it will allow to return any variable we need
        .map{
            //now type is not String but integer type is changed
            it.length
        }
        .forEach {
            println(it)
        }

    println("with functional foreach take n number of items")
    list
        .filterNotNull()
       // .take(3)
        .takeLast(3)
        .forEach {
            println(it)
        }

    println("with functional foreach take n number of items")
    list
        .filterNotNull()
        // .take(3)
        .takeLast(3)
        .forEach {
            println(it)
        }

    //associating  input values with other to return map
    //maps string to the numberof characters in that string
    println("associating  input values with other to return map")
    val map = list
        .filterNotNull()
        .associate { it to it.length }
        .forEach {

            println("${it.value} , ${it.key}")
        }
    //find
    val language = list.filterNotNull().find { it.startsWith("java") }
    println("new one ${language}" )

    //to solve null use orEmpty
    val language2 = list.filterNotNull().find { it.startsWith("foo") }.orEmpty()
    println(" checked for nul ${language2} " )





}










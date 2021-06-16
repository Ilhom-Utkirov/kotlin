
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
    val list = listOf("Kotlin", "java", "C++", "js")
    //need to pas func as 2ndparameter to print filters

    //1 way
    //standard way of specifiying the lamda function
    printFilteredStrings(list, { it.startsWith("K") })

    //2 way
    //lamda can be declared in the outside of the function
    printFilteredStrings(list){
         it.startsWith("j")
    }

    //now null is handled
    printFilteredStrings(list, null)

    //3rd way
    //lambda can be declared in the outside of the function
    printFilteredStrings(list, pred)

    //4th way
    //lambda can be returned from function
    println("with function ")
    printFilteredStrings(list, getPrintPredicate())








}










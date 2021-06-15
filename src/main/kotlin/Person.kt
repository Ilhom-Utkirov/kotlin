/**
 * @author : Ilhom O'tkirov
 * @created : 15.06.2021, вторник
 **/
class Person(val firstName: String = "Peter1", val lastName: String = "Parker1"){


    var nickname : String? = null
        set(value) { //faunction behaviour when set is called
            //logout if nickname is set
            field = value
            println("the new nickname is $value")
        }
        get() {
            println("returned value is $field")
            return field
        }


    fun printInfo(){
        //val nickNameToPrint = if(nickname==null)"no nickname" else nickname
        val nickNameToPrint = nickname ?: "no nickanme"
        println("$firstName ($nickNameToPrint) $lastName" )
    }

    //visibility modifier


    //see which works first
//    init {
//        println("init 1")
//    }
//
//
//    //secondary constructor
//    constructor(): this("Peter", "Parker"){
//        println("secondary constructor")
//    }
//
//    init {
//        println("init 2")
//    }







//    (_firstName:String, _lastName:String) {
//
//    val firstName: String = _firstName
//    val lastName: String = _lastName

    //to initialaize
//    init {
//        firstName = _firstName
//        lastName = _lastName
//    }

}
interface IdProvider{
    fun getId(): String
}

object EntityFactory{
    fun create() = Entity("id", "name")
}

//class Entity private constructor(val id :String){
class Entity constructor(val id :String,  val name:String){

//    companion object Factory{              //  : IdProvider {
//
//    const val id = "id"
//        //fun create() = Entity("id")
//        fun create() = Entity("id")
//
//    }

    override fun toString(): String {
        return "id: $id name:$name"
    }

}


fun main (){
    //val entity = Entity.Companion.create() //if no name
    //val entity = Entity.anyName.create()  // if name exists
   // val entity = Entity.Factory.create() //possible in kotlin
    //Entity.id

    val entity = EntityFactory.create()
    println(entity)

}
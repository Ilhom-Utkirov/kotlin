interface IdProvider{
    fun getId(): String
}


class Entity private constructor(val id :String){

    companion object anyName : IdProvider {
        override fun getId(): String {
          return "123"
        }

    const val id = "id"
        //fun create() = Entity("id")
        fun create() = Entity(getId())

    }
}


fun main (){
    //val entity = Entity.Companion.create() //if no name
    //val entity = Entity.anyName.create()  // if name exists
    val entity = Entity.create() //possible in kotlin
    Entity.id

}
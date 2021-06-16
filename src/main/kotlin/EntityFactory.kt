import java.util.*

interface IdProvider{
    fun getId(): String
}

enum class EntityType{
    EASY, MEDIUM, HARD;

    fun getFormattedName() = name.toLowerCase().capitalize() //Medium
}

object EntityFactory{
    //fun create() = Entity("id", "name")
    fun create(type: EntityType):Entity {
        val id = UUID.randomUUID().toString()
        val name = when(type){
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> "Hard"
        }
        return Entity(id , name)
    }
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

    val entity = EntityFactory.create(EntityType.EASY)
    println(entity)

    val mediumEntity = EntityFactory.create(EntityType.MEDIUM)
    println(mediumEntity)

}
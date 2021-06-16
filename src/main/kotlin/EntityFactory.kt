import java.util.*

interface IdProvider{
    fun getId(): String
}

enum class EntityType{
    HELP, EASY, MEDIUM, HARD;

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
            EntityType.HELP -> type.getFormattedName()
        }
        //return Entity(id , name)
        return when(type){
            EntityType.EASY -> Entity.Easy(id, name)
            EntityType.MEDIUM -> Entity.Medium(id, name)
            EntityType.HARD -> Entity.Hard(id, name , multiplier = 2f)
            EntityType.HELP -> Entity.Help
        }
    }
}

//class Entity private constructor(val id :String){

//class Entity constructor(val id :String,  val name:String){

//    companion object Factory{              //  : IdProvider {
//
//    const val id = "id"
//        //fun create() = Entity("id")
//        fun create() = Entity("id")
//
//    }

//    override fun toString(): String {
//        return "id: $id name:$name"
//    }
//
//}


sealed class Entity {


    object Help : Entity() {
        val name = "Help"
    }
    data class Easy(val id :String,  val name:String) : Entity()
//    {
//        override fun equals(other: Any?): Boolean {
//            return super.equals(other)
//        }
//
//        override fun hashCode(): Int {
//            return super.hashCode()
//        }
//
//    }
    data class Medium(val id :String,  val name:String) : Entity()
    data class Hard(val id :String,  val name:String, val multiplier: Float) : Entity()

}

fun Entity.Medium.printInfo(){
    println("Medium class: $id")
}


val Entity.Medium.info : String
    get() = "some ifnfo"



fun main (){
    //val entity = Entity.Companion.create() //if no name
    //val entity = Entity.anyName.create()  // if name exists
   // val entity = Entity.Factory.create() //possible in kotlin
    //Entity.id

//    val entity = EntityFactory.create(EntityType.EASY)
//    println(entity)
//
//    val mediumEntity = EntityFactory.create(EntityType.MEDIUM)
//    println(mediumEntity)

    val entity :Entity = EntityFactory.create(EntityType.HELP)
    val msg = when (entity){
        Entity.Help -> "help class"
        is Entity.Easy -> "easy class" //we have static type checking specifying type of entity want back and checking type we get
        is Entity.Hard -> "medium class"
        is Entity.Medium -> "hard class"
    }
    println(msg)

//    val entity1 = EntityFactory.create(EntityType.EASY)
//    val entity2 = EntityFactory.create(EntityType.EASY)
    //not equal as id is uuid
    val entity1 = Entity.Easy("id", "name")

    //val entity2 = Entity.Easy("id", "name")
    //val entity2 = entity1.copy( name = "new name")
    //val entity2 = entity1


//    if(entity1 === entity2){
//        println("they are equal")
//    }else{
//        println("not equal")
//    }

    //Entity.Medium("id", "name").printInfo()

    


    val entity2 = EntityFactory.create(EntityType.MEDIUM)
    if(entity2 is Entity.Medium){
        entity2.printInfo()
        entity2.info
    }






}
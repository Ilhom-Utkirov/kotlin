/**
 * @author : Ilhom O'tkirov
 * @created : 15.06.2021, вторник
 **/
interface PersonInfoProvider{
    val providerInfo: String

    fun printInfo(person:Person){
        println( "basic info provider" )
        person.printInfo()
    }
}

interface SessionInfoProvider {
    fun getSessionId() : String
}


//1 st class
class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {

    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("some additional statement")
    }

    override fun getSessionId(): String {
        return "Session"
    }

}

//main class
fun main (){
    val provider = BasicInfoProvider()

    provider.printInfo(Person())
    println("get Session id")
    provider.getSessionId()
}
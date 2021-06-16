import com.sun.deploy.ui.FancyButton


/**
 * @author : Ilhom O'tkirov
 * @created : 15.06.2021, вторник
 **/
interface PersonInfoProvider{
    val providerInfo: String

    fun printInfo(person:Person){
        //println( "basic info provider" )
        println( providerInfo)
        person.printInfo()
    }
}

interface SessionInfoProvider {
    fun getSessionId() : String
}


//1 st class
open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {


    override val providerInfo: String
        get() = "BasicInfoProvider"

    protected open val sessionIdPrefix = "Session"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("some additional statement")
    }

    override fun getSessionId(): String {
        return sessionIdPrefix
    }

}

//main class
fun main (){

    val provider = FancyInfoProvider()

    provider.printInfo(Person())
    //println("get Session id")
    println( provider.getSessionId() )
    checkTypes(provider)

}


fun checkTypes (infoProvider: PersonInfoProvider){
    if(infoProvider !is SessionInfoProvider){
        println("not a session info provider")
    }else{
        println("is a session info provider")
        //(infoProvider as SessionInfoProvider).getSessionId()
        println( infoProvider.getSessionId() ) //doing smart casting, NO NEED TO DO IT EACH TIME
    }


}
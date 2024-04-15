package OOP_Inheritance_Abstract_Inferface

//Abstraction
/*
You can't create an object on abstract class.
why we use abstraction...
We don't want to create an object of Main Parent Class or Base Class. So we use abstract Keyword on them.
Child class which inherit abstract class, abstract variable & function must be declared and implement on child classes.
We use abstract keyword on variable & function for when we need Sub classes are must be used this function and customized it.

note: We want child class object must be followed as base class object architecture & maintain that. This why we
use abstract...
*/

abstract class Player(){
    abstract fun play()
    abstract fun pause()
    abstract fun stop()
}
class LocalPlayer: Player(){
    override fun play() {
        println("Local Music is playing...")
    }
    private fun getLocalData(){
        println("get data from local...")
    }
    override fun pause() {
        println("Local Music is pause...")
    }
    override fun stop() {
        println("Local Music is stop...")
    }
}

class RemotePlayer: Player(){
    override fun play() {
        println("Remote Music is playing...")
    }
    private fun getAPIData(){
        println("getting data from api...")
    }
    override fun pause() {
        println("Remote Music is pause...")
    }
    override fun stop() {
        println("Remote Music is stop...")
    }
}

fun main(){
    println("Select Music list: 1.Local 2.Cloud")
    val selectOption = readlnOrNull()?.toIntOrNull()

    val player: Player? = when(selectOption){
        1 -> {
            LocalPlayer()
        }
        2 -> {
            RemotePlayer()
        }
        else -> null
    }

    player?.let {
        it.play()
        it.pause()
        it.stop()
    }

    //why use this 'Player?' in 54 line?...
    //First we use 'abstract' key in Base class so user can't create Base Class object directly,
    //So user called child class but user can access only Base class functions, user does not need to know
    //what happening in background (getAPIData(),getLocalData() user doesn't need those function, so why
    //we give access to user this function ).
    //That's why came encapsulation concept...
}

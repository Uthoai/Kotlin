package Liskov_Subtitution_Principle

open class Vehicle{
    fun start(){
        println("Vehicle is Starting...")
    }
    fun stop(){
        println("Vehicle is Stop...")
    }
}
abstract class FuelCarryAble(): Vehicle(){
    abstract fun fuel()
}
class Car: FuelCarryAble(){
    override fun fuel() {
        println("Car can carry 200L fuel.")
    }
}
class Bus: FuelCarryAble(){
    override fun fuel() {
        println("Bus can carry 350L fuel.")
    }
}
class Electric: Vehicle(){
    fun electricEnergy(){
        println("Electric Vehicle")
    }
}

class Refuel(){
    fun refuel(fuelCarryAble: FuelCarryAble){
        fuelCarryAble.fuel()
    }
}

fun main(){
    val vehicleRefuel = Refuel()
    vehicleRefuel.refuel(Car())
    vehicleRefuel.refuel(Bus())
    //vehicleRefuel.refuel(Electric())  This line will be Error
}

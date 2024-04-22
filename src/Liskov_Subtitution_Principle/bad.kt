package Liskov_Subtitution_Principle

/*

interface FuelCapacity{
    fun fuel()
}
abstract class Vehicle: FuelCapacity{
    fun start(){
        println("Vehicle Starting...")
    }
}
class Car: Vehicle(){
    override fun fuel() {
        println("Car can carry 200L fuel.")
    }
}
class Bus: Vehicle(){
    override fun fuel() {
        println("Bus can carry 350L fuel.")
    }
}
class Electric: Vehicle(){
    override fun fuel() {
        throw Exception("Electric Car don't carry fuel")
    }
}

class Refuel(){
    fun refuel(vehicle: Vehicle){
        vehicle.fuel()
    }
}

fun main(){
    val vehicleRefuel = Refuel()
    vehicleRefuel.refuel(Car())
    vehicleRefuel.refuel(Bus())
    vehicleRefuel.refuel(Electric())
}

*/

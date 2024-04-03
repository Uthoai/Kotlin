interface Roamable {
    fun roam()
}

class Vehicle: Roamable{
    override fun roam() {
        println("The Vehicle is roaming.")
    }
}

abstract class Animal: Roamable {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger = 10

    abstract fun makeNoise()

    abstract fun eat()

    override fun roam(){
        println("The Animal is roaming.")
    }
    fun sleep(){
        println("The Animal is sleeping.")
    }
}

class Hippo: Animal(){
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }
    override fun eat() {
        println("The Hippo is eating $food.")
    }
}

abstract class Canine: Animal(){
    override fun roam() {
        println("The Canine is roaming.")
    }
}

class Wolf: Canine(){
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Hoooooowl!")
    }
    override fun eat() {
        println("The Wolf is eating $food.")
    }
}

class Fox: Canine(){
    override val image = "fox.jpg"
    override val food = "meat"
    override val habitat = "forest"

    override fun makeNoise() {
        println("Hoowl! Hoowl! ")
    }

    override fun eat() {
        println("The Fox is eating $food")
    }
}



class Vet{
    fun giveShot(animal: Animal){
        animal.makeNoise()
    }
}

fun main(){
    val animals = arrayOf(Hippo(),Wolf())
    for (item in animals){
        item.roam()
        item.eat()
    }
    val vet = Vet()
    val hippo = Hippo()
    val wolf = Wolf()
    vet.giveShot(hippo)
    vet.giveShot(wolf)

    println()

    val roamables = arrayOf(Hippo(),Wolf(),Vehicle())
    for (item in roamables){
        item.roam()
        if (item is Animal){
            item.eat()
        }
    }
}

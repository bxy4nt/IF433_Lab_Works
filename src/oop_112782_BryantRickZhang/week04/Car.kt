package oop_112782_BryantRickZhang.week04

class Car (
    brand: String,
    val numberofDoors: Int
) : Vehicle(brand) {

    override fun honk (){
        println("Beep! Beep!")
    }

    fun openTrunk(){
        println("Bagasi $brand terbuka")
    }
}
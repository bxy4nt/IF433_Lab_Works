package oop_112782_BryantRickZhang.week04

open class Car (
    brand: String,
    val numberofDoors: Int
) : Vehicle(brand) {

    override fun honk (){
        println("Beep! Beep!")
    }

    override fun accelerate(){
        super.accelerate()
        println("$brand melaju lebih cepat!")
    }
    fun openTrunk(){
        println("Bagasi $brand terbuka")
    }
}
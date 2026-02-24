package oop_112782_BryantRickZhang.week04

open class Vehicle(
    val brand: String,
){

    open fun honk(){
        println("Tuut! Tuut!")
    }

    open fun accelerate(){
        println("$brand sedang berakselerasi. ")
    }
}

package oop_112782_BryantRickZhang.week04

fun Main() {

    val vehicle = Vehicle("Generic Brand")
    vehicle.honk()
    vehicle.accelerate()

    println("-----")

    val car = Car("Toyota", 4)
    car.honk()
    car.accelerate()
    car.openTrunk()
}
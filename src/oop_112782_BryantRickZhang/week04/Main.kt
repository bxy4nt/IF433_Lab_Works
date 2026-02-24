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

    println("-----")

    val electricCar = ElectricCar("Tesla", 4, 90)
    electricCar.accelerate()
    electricCar.openTrunk()
    electricCar.honk()

    println("-----")

    val manager = Manager("Ryan", 10000000)
    manager.work()
    println("Bonus Manager: ${manager.calculateBonus()}")

    println("-----")
    val developer = Developer("Ijat",8000000, "Kotlin")
    developer.work()
    println("Bonus Manager: ${developer.calculateBonus()}")
}
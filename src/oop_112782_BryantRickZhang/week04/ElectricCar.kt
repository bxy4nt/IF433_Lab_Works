package oop_112782_BryantRickZhang.week04

class ElectricCar(
    brand: String,
    numberofDoors: Int,
    val batteryCapacity: Int,
) : Car(brand, numberofDoors) {

    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}
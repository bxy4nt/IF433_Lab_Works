package oop_112782_BryantRickZhang.week01

fun main (args: Array<String>) {
    var radius: Double = 7.0
    var pi = 3.14

    var area: Double = pi * radius * radius
    println("Radius: " + radius + ", area: " + area)

    checksize(area)
}
    fun checkSize(area: Double) {
    if (area > 100) {
        println("This is a Big Circle")
    } else {
        println("This is a Small Circle")
    }
}


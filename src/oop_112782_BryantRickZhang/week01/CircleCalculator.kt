package oop_112782_BryantRickZhang.week01

fun main () {
    val radius = 7.0
    val pi = 3.14

    var area: Double = pi * radius * radius
    println("Radius: " $radius + ", area: " $area)

    println("Area : ${checkSize(area)}")
}
    fun checkSize(area: Double)= if (area > 100) "This is a Big Circle" else "This is a Small Circle"


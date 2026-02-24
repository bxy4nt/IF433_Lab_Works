package oop_112782_BryantRickZhang.week03

fun main() {
    val e = Employee("Bryant", 1000)
    e.salary = -500
    e.salary = 5000

    e.updateRating(4)

    println("Salary: ${e.salary}")
    println("Bonus: ${e.bonus}")
}
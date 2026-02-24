package oop_112782_BryantRickZhang.week03

fun main() {
    val e = Employee("Bryant", 1000)
    e.salary = -500
    e.salary = 5000

    e.updateRating(4)

    println("Salary: ${e.salary}")
    println("Bonus: ${e.bonus}")

    val sword = Weapon("Excalibur", 100)

    sword.damage =-50
    sword.damage =9999

    println("Damage: ${sword.damage}")
    println("Tier: ${sword.tier}")

    val player = player("Bryant")

    player.addXp(50)
    println("Level sekarang: ${player.level}")

    player.addXp(60)
    println("Level sekarang: ${player.level}")
}
package oop_112782_BryantRickZhang.week02

import java.util.Scanner

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {

    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) {
            hp = 0
        }
    }

    fun isAlive(): Boolean {
        return hp <= 0
    }
}

fun main() {

    val scanner = Scanner(System.`in`)

    println("--- MINI RPG BATTLE ---")

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage: ")
    val baseDamage = scanner.nextInt()
    scanner.nextLine()

    val hero = Hero(heroName, baseDamage)

    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {

        println("\n1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")
        val choice = scanner.nextInt()

        if (choice == 1) {

            hero.attack("Enemy")

            enemyHp -= hero.baseDamage
            if (enemyHp < 0) {
                enemyHp = 0
            }

            println("HP Enemy sekarang: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Enemy menyerang balik sebesar $enemyDamage!")

                hero.takeDamage(enemyDamage)
                println("HP Hero sekarang: ${hero.hp}")
            }

        } else if (choice == 2) {
            println("Hero kabur dari pertarungan!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
    }
    println("\n--- HASIL PERTARUNGAN ---")

    if (hero.hp > 0 && enemyHp <= 0) {
        println("${hero.name} MENANG!")
    } else if (hero.hp <= 0) {
        println("${hero.name} KALAH!")
    } else {
        println("Pertarungan dihentikan.")
    }
}


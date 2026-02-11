package oop_112782_BryantRickZhang.week02

import java.util.Scanner

fun main (){
    val scanner = Scanner(System.`in`)

    println("--- Aplikasi PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if(nim.length != 5){
        println("Error: Pendaftaran dibatalkan. Nim harus 5 karakter!")
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = student(name , nim, major)
        println("Status: Pendaftaran Selesai")
    }
}
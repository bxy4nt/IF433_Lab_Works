package oop_112782_BryantRickZhang.week10

fun main() {
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("Generics in Kotlin")
    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")
}
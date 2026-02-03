package oop_112782_BryantRickZhang.week01

fun main(){
    // REFRACTOR: Gunakan val dan hapus tipe data eksplisit
    val name = "Bryant Rick Zhang"
    val score = 80

    // REFRACTOR: String Template ($name)
    println("Name: $name , Nilai: $score")

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..80 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade: $grade")

    println("Status : ${calculateStatus(score)}")
}

fun calculateStatus(score: Int)= if (score > 75) "Lulus" else "Tidak Lulus"

package oop_112782_BryantRickZhang.week11

fun main() {
    // Checkpoint 4: Menggunakan let untuk null safety
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    val length = name?.let {
        println("Nama terdeteksi: $it") // 'it' merujuk pada variabel name
        it.length // Baris terakhir dikembalikan sebagai hasil
    }
    println("Panjang nama: $length")
}
package oop_001_BryantRickZhang.week01

fun main() {
    val gameTitle: String = "SteamKW Game"
    val price: Int = 500000
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) price - (price * 20 / 100)
    else price - (price * 10 / 100)

fun printReceipt(title: String, finalPrice: Int) {
    println("Judul Game: $title")
    println("Harga Akhir: Rp $finalPrice")
}
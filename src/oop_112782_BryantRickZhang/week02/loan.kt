package oop_112782_BryantRickZhang.week02

import java.util.Scanner

class Loan(
    val bookTitle: String,
    val borrower: String,
    var loanDuration: Int = 1
) {
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}

fun main () {

    val scanner = Scanner(System.`in`)

    println("--- SISTEM PEMINJAMAN BUKU ---")

    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) {
        println("Durasi tidak boleh minus! Diubah menjadi 1 hari")
        duration = 1
    }

    val loan = Loan(bookTitle, borrower, duration)

    println("\n--- DETAIL PEMINJAMAN ---")
    println("Judul Buku : ${loan.bookTitle}")
    println("Peminjam   : ${loan.borrower}")
    println("Judul Buku : ${loan.loanDuration} hari")
    println("Total denda: Rp ${loan.calculateFine()}")

}
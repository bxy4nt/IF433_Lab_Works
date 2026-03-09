package oop_112782_BryantRickZhang.week05

class EWallet (
    accountName: String,
    var balance: Double
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {

        if (balance >= amount) {
            balance -= amount
            println("Pembayaran berhasil menggunakan EWallet oleh $accountName")
        } else {
            println("Saldo tidak cukup")
        }
    }

    fun topup(amount: Double) {
        balance += amount
        println("Topup berhasil. Saldo sekarang: $balance")
    }
}
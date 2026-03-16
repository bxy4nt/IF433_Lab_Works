package oop_112782_BryantRickZhang.week06

class Gopay: PaymentMethod {

    override fun pay(amount: Double) {
        println("Membayar Rp$amount menggunakan Gopay")
    }
}

class CreditCard: PaymentMethod {

    override fun pay(amount: Double) {
        println("Membayar Rp$amount menggunakan CreditCard")
    }
}
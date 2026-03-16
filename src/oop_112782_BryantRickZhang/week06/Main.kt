package oop_112782_BryantRickZhang.week06

fun processCheckout(paymentMethod: PaymentMethod, amount: Double) {
    paymentMethod.pay(amount)
}

fun main(){

    val Gopay = Gopay()
    val CreditCard = CreditCard()

    processCheckout(Gopay, 50000.0)
    processCheckout(CreditCard, 120000.0)
}
package oop_112782_BryantRickZhang.week05

abstract class PaymentMethod (
    val accountName: String
){
    abstract fun processPayment(amount: Double)
}
package oop_112782_BryantRickZhang.week06

fun processCheckout(paymentMethod: PaymentMethod, amount: Double) {
    paymentMethod.pay(amount)
}

fun main(){

    val Gopay = Gopay()
    val CreditCard = CreditCard()

    processCheckout(Gopay, 50000.0)
    processCheckout(CreditCard, 120000.0)

    val lamp = SmartLamp("01", "Lampu Ruang Tamu")
    val speaker = SmartSpeaker("02", "Google Nest Dapur")
    val cctv = smartCCTV("03", "Ezviz Garasi")

    val hub = SmartHomeHub()

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    hub.activateSecurityMode()

    hub.turnOffAllSwitches()
}
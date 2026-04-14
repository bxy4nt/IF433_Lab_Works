package oop_112782_BryantRickZhang.week08

fun Main (){
    println("=== TEST SAFE CALLS & ELVIS === ")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")
}
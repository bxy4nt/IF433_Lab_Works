package oop_112782_BryantRickZhang.week05

fun Main() {

    val dosen = Dosen("Pak Budi")
    val admin = Admin("Bu Lina")

    val daftarPegawai: List<Pegawai> = listOf(dosen, admin)

    for (Pegawai in daftarPegawai) {

        Pegawai.bekerja()

        when (Pegawai) {
            is Dosen -> Pegawai.mengajar()
            is Admin -> Pegawai.doAdminWork()
        }

        println()
    }

        // == CHECKPOINT 6:
        val math = MathHelper()

        println("Luas Persegi: ${math.hitungLuas(4)}")
        println("Luas Persegi Panjang: ${math.hitungLuas(4,6)}")
        println("Luas Lingkaran: ${math.hitungLuas(7.0)}")

        // == CHECKPOINT 10:
        val wallet = EWallet("Bryant", 50000.0)
        val card = CreditCard ("Bryant", 100000.0)

        val payments: List<PaymentMethod> = listOf(wallet, card)

        for(payment in payments) {

            payment.processPayment(7500.00)

            if (payment is EWallet) {
                payment.topup(50000.0)
                payment.processPayment(75000.0)
            }
            println()
        }
}
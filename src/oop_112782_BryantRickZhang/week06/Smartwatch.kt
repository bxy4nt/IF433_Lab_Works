package oop_112782_BryantRickZhang.week06

class Smartwatch(
    brand: String
) : Watch(brand), FitnessTrackable, Notifiable {

    override fun showTime() {
        println("Menampilkan waktu di smartwatch $brand")
    }

    override fun trackSteps() {
        println("Menghitung langkah kaki...")
    }

    override fun showNotification(message: String) {
        println("Notifikasi: $message")
    }
}
package oop_112782_BryantRickZhang.week05

class Admin(
    nama : String
) : Pegawai(nama) {

    override fun bekerja() {
        println("$nama sedang mengelola administrasi Kampus.")
    }

    fun mengarsipkan (){
        println("$nama sedang mengarsipkan dokumen.")
    }
}
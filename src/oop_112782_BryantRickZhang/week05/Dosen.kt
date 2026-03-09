package oop_112782_BryantRickZhang.week05

class Dosen(
    nama: String
) : Pegawai (nama) {

    override fun bekerja() {
        println("$nama sedang menyiapkan materi perkuliahan dan merivisi RPKPS.")
    }

    fun mengajar (){
        println("$nama sedang mengajar mahasiswa dikelas.")
    }
}
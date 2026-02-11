package oop_112782_BryantRickZhang.week02

class student (val name: String, val nim: String, val major: String) {
    init {
        //Validasi Sederhana : Cek panjang NIM
        if(nim.length !=5 ) {
            println("Warning : Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem")
        } else {
            println("LOG: Objek Student $name berhasil dilokasikan di memory")
        }
    }
}


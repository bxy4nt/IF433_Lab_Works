package oop_112782_BryantRickZhang.week02

class Student(
    val name: String,
    val nim: String,
    val major: String,
    var gpa: Double = 0.0
) {

    init {
        //Validasi Sederhana : Cek panjang NIM
        if(nim.length !=5 ) {
            println("Warning : Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem")
        } else {
            println("LOG: Objek Student $name berhasil dilokasikan di memory")
        }
    }

    constructor(name: String, nim: String)
            : this(name, nim, "Non-Matriculated", 0.0) {
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }


}


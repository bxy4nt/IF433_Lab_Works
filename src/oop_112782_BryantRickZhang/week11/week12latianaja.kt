package oop_112782_BryantRickZhang.week11

fun pembagian () {
    try {
        val a = 10
        val b = 2
        val hasil = a/b
        println("hasil bagi $hasil")
    } catch (e: Exception) {
        println("ada error " + e.message)
    } finally {
        println("selesai try catch")
    }
}

fun cek_tipe_variabel(){
    var angka:Int = try{
        Integer.parseInt("123")
    } catch (e: Exception){
        println("Ada error ${e.message}")
        -67
    }
    println(angka)
}

fun main(){
    pembagian()
    cek_tipe_variabel()
}
package latihanweek10
import sun.net.www.content.text.Generic
import kotlin.jvm.Throws

class nonGeneric(var hasil: Any)

class generic <T> (var hasil: T)

class Kota <K, V> (var kodepos:K, var telp: V)

fun <T> cobaFungsi (angka: T): T {
    return angka
}

fun <T: Number> tambah(angka: T): Double{
    return angka.toDouble() + 50
}

fun <T: Number> kurang(angka: T): Int {
    return angka.toInt() - 50
}

class kalkulator<T:Number>(val a:T, val b:T) {
    fun kali():Double {
        return a.toDouble() * b.toDouble()
    }
    fun bagi(): Int {
        return a.toInt() / b.toInt()
    }
}

fun <T> nilaiKKM(list: List<T>,kkm:T): List<T> where T: Comparable<T> {
    return list.filter { it >= kkm}
}

fun main () {
    println("=== Generic - WHERE ===")
    val nilaiMhs = listOf(80,90,83,70,65,50,83,40,61);
    val nilaiFilterKKM = nilaiKKM(nilaiMhs,70);
    println(nilaiFilterKKM);
    println(nilaiMhs);

    println("=== Generic - Function in class ===")
    val kalk= kalkulator(a= 10.2, b= 3.5);
    println("Hasil kali: ${kalk.kali()}");
    println("Hasil bagi: ${kalk.bagi()}");

    println("=== NonGeneric ===")
    val nGen = nonGeneric(100)
    val AngkanGen = nGen.hasil as Int
    println(AngkanGen + 50)

    println("=== Generic ===")
    val gen = generic(200)
    println(gen.hasil + 50)

    println("=== Generic 2 parameter ===")
    val city = Kota("12345", 881234)
    println("kodepos Kamu : " + city.kodepos)
    println("telp Kamu : " + city.telp)

    println("=== Generic - Function ===")
    println ("coba : " + cobaFungsi(10))

    println("=== Generic Constraint ===")
    println ("Hasil tambah: " + tambah(100.5))
    println ("Hasil kurang: " + kurang(100.5))
}
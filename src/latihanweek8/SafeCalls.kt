package latihanweek8

class Alamat (val kota:String);
class Mahasiswa(val address: Alamat);

fun main () {
    val mhs1 = Mahasiswa(Alamat("Tangerang"));
    val mhs2 = Mahasiswa(Alamat("null"));

    println("mahasiswa1 : ${mhs1.address.kota}");
    println("mahasiswa2 : ${mhs2.address.kota}");

    val tetapAlamat = Alamat (kota = "null");
    val defaultAlamat = tetapAlamat.kota?:"Alamat kamu kosong"
    println("Alamat kamu  : ${defaultAlamat}");
}
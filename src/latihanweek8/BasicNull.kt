package latihanweek8

class profile_page(val idprofile:String, val statusOnline:String?){
fun ganti_foto(filePhoto:String?) {
    println("foto kamu ${filePhoto} ")
}}
fun main (){
    var nama:String? = "Bryant"
    nama = null;
    println("nama kamu $nama");

    val profile = profile_page(idprofile = "12345", statusOnline = "Null");
    println("id ${profile.idprofile} status: ${profile.statusOnline}")

    profile.ganti_foto("fotosaya.jpg")
}
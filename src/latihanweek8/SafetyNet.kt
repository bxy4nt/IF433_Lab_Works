package latihanweek8

fun main () {
    var nama:String? ="Bryant";

    try {
        println("hai $nama");
        println("panjang huruf ${nama!!.length}");
    }   catch (e: NullPointerException) {
        println("ada error exception, ini pesan errornya ${e.message} ")
    }

    val mixedData: List<Any> = listOf(1,"Budi", 10, "Online");
    for(item in mixedData){
        val hasil = item as? String
        if(hasil != null){
            println(hasil)
        }
    }
}
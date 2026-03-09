package oop_112782_BryantRickZhang.week05

fun Main() {

    val dosen = Dosen("Pak Budi")
    val admin = Admin("Bu Lina")

    val daftarPegawai: List<Pegawai> = listOf(dosen, admin)

    for (Pegawai in daftarPegawai) {

        Pegawai.bekerja()

        when (Pegawai) {
            is Dosen -> Pegawai.mengajar()
            is Admin -> Pegawai.mengarsipkan()
        }

        println()
    }
}
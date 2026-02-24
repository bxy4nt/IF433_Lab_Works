package oop_112782_BryantRickZhang.week03

class player(
    val username: String
) {
    private var xp: Int = 0

    val level: Int
    get() =  (xp / 100) + 1

    fun addXp(amount: Int) {
        if (xp < amount) {
            val oldLevel = level
            xp += amount
            if(level > oldLevel) {
                println("Level up! Selamat surname naik ke level $level" )
            }
        }
    }
}
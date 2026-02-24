package oop_112782_BryantRickZhang.week03

class Employee(
    val name: String,
    salary: Int
) {
    var salary: Int = salary
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("Salary tidak boleh negatif!")
            }
        }

    private var performance: Int = 0

    fun updateRating(newrating: Int) {
    if(newrating in 1..5){
        performance = newrating
    } else {
        println("Rating harus antara 1 sampai 5")
    }
}

    val bonus: Int
        get() = salary / 10
}
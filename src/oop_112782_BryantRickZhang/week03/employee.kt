package oop_112782_BryantRickZhang.week03

class Employee(
    val name: String,
) {
    var salary: Int = salary
        set(value) {
            if(value >=0){
                field = value
            } else {
                println("Salary tidak boleh negatif!")
            }
        }
}
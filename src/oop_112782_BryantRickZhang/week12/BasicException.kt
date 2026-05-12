package oop_112782_BryantRickZhang.week12

fun divide(a: Int, b: Int): Int {
    try {
        return a / b
    } catch (e: ArithmeticException) {
        println("Error: ${e.message}")
        return -1
    } finally {
        println("Division attempt finished")
    }
}

fun main() {
    println("=== TEST TRY AS EXPRESSION ===")
    val inputString = "123A"

    val result: Int = try {
        Integer.parseInt(inputString)
    } catch (e: NumberFormatException) {
        -1
    }

    println("Hasil parsing: $result")

    // Testing divide function
    println("\n=== TEST BASIC DIVIDE ===")
    println("Result: ${divide(10, 0)}")
}
package oop_112782_BryantRickZhang.week08

fun main() {
    val rawApiData : List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"),
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"),
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
    )

    val parser = ApiParser()

    for (rawApiData in rawApiData) {
        try {
            val product = parser.parseProduct(rawApiData)

            product?.let {
                when (it) {
                    is Electronic -> println("Electronic: ${it.name} (Warranty ${it.warrantyMonths})")
                    is Clothing -> println("Clothing: ${it.name} (Size ${it.size})")
                }
                parser.checkout(it)
            }
        } catch (e: IllegalArgumentException) {
            println("Warning: ${e.message}")
        }
    }
}
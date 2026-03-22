package oop_112782_BryantRickZhang.week07

fun main(){
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n==== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    val u1 = UserData("Budi", 20)
    val u2 = UserData("Budi", 20)
    println(u1)
    println(u1 == u2)

    val u3 = u1.copy(age = 25)
    val (name, age) = u3

    println(name)
    println(age)
}
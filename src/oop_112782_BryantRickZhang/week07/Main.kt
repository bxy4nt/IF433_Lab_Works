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

    val response: ApiResponse = ApiResponse.Success("OK")
    val msg = when (response) {
        is ApiResponse.Success -> response.data
        is ApiResponse.Error -> response.message
        ApiResponse.Loading -> "Loading..."
    }

    GameManager.startGame()
    GameManager.startGame()

    println("Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    val starterWeapon = Weapon.forgeStarterSword()
    println("Nama: ${starterWeapon.item.name}")
    println("Damage: ${starterWeapon.item.damage}")
    println("Rarity: ${starterWeapon.item.rarity}")
    println("Durability: ${starterWeapon.durability}")

    val upgradedItem = starterWeapon.item.copy(damage = 25)
    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}
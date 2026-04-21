package oop_112782_BryantRickZhang.week09

fun main () {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15, 8.1, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 8, -12.4, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 12, 0.0, "CLOSED"),
        TradeLog("XRPUSDT", "LONG", 5, 4.3, "OPEN"),
        TradeLog("BTCUSDT", "LONG", 25, -2.5, "OPEN")
    )

    val closedTrades = tradeHistory
        .filter { it.status == "CLOSED" }
}
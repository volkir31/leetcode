import kotlin.math.max

// Task - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
fun main() {
    println(maxProfit(intArrayOf(7,6,4,3,1)))
    println(maxProfit(intArrayOf(7,1,5,3,6,4)))
}

fun maxProfit(prices: IntArray): Int {
    if (prices.isEmpty()) return 0
    var buy = prices[0]
    var sell = prices[0]
    var profit = 0
    for (price in prices) {
        if (price < buy) {
            sell = price
            buy = price
        }
        if (sell < price) {
            sell = price
        }
        profit = max(profit, sell - buy)
    }

    return profit
}
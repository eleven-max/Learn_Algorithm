package dp.maxProfit

//https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
class SolutionKt2 {
    fun maxProfit(prices: IntArray): Int {
        val dpHas = IntArray(prices.size) { 0 }
        val dpNoHas = IntArray(prices.size) { 0 }

        dpHas[0] = -prices[0]

        for (i in 1 until prices.size) {
            dpHas[i] = Math.max(dpHas[i - 1], -prices[i] + dpNoHas[i - 1])
            dpNoHas[i] = Math.max(dpNoHas[i - 1], prices[i] + dpHas[i - 1])
        }
        return Math.max(dpHas[prices.size - 1], dpNoHas[prices.size - 1])
    }
}
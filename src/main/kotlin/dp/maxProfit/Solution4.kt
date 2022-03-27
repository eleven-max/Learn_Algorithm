package dp.maxProfit

import com.evan.dynamicprogramming.Common.CommonUtil

//https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/
class Solution4 {

    fun maxProfit(prices: IntArray, fee: Int): Int {
        val dp = Array(2) { IntArray(prices.size) { 0 } }
        dp[0][0] = -prices[0] - fee
        dp[1][0] = 0
        for (i in 1 until prices.size){
            dp[0][i] = Math.max(dp[0][i-1], dp[1][i-1] - prices[i] - fee)
            dp[1][i] = Math.max(dp[1][i-1], dp[0][i-1] + prices[i])
        }
        CommonUtil.printMatrix(dp)
        return Math.max(dp[0][dp[0].size-1], dp[1][dp[0].size - 1])
    }
}

fun main() {
    val solutionKt4 = Solution4()
    val fee = 2
    val prices = intArrayOf(1, 3, 2, 8, 4, 9)
    val r = solutionKt4.maxProfit(prices, fee)
    println(r)
}
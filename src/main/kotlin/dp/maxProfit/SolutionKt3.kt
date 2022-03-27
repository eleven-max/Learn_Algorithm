package dp.maxProfit

import com.evan.dynamicprogramming.Common.CommonUtil
//https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
class SolutionKt3 {

    fun maxProfit(prices: IntArray): Int {
        val dp = Array(3) { IntArray(prices.size) { 0 } }
        //0, 持有股票
        //1,处于冷冻期
        //2,不吃持有股票，也非冷冻期
        dp[0][0] = -prices[0]
        dp[1][0] = 0
        dp[2][0] = 0
        for (i in 1 until prices.size){
            //持有股票的最大收益
            dp[0][i] = Math.max(dp[0][i-1], dp[2][i-1] - prices[i])
            //处于冷冻期，今天卖出股票
            dp[1][i] = dp[0][i-1] + prices[i]
            //不处于冷冻期，也不持有股票
            dp[2][i] = Math.max(dp[2][i-1], dp[1][i-1])
        }
        val end = prices.size -1
//        CommonUtil.printMatrix(dp)
        return Math.max(dp[0][end], Math.max(dp[1][end], dp[2][end]))
    }
}

fun main() {
    val solutionKt3 = SolutionKt3()
    val r = solutionKt3.maxProfit(intArrayOf(1,2,3,0,2))
    println(r)
}
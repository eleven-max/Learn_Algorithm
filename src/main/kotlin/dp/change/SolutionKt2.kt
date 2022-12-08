package dp.change

//https://leetcode-cn.com/problems/coin-change-2/
class SolutionKt2 {

    fun change(amount: Int, coins: IntArray): Int {
        val dp = IntArray(amount + 1) { 0 }
        dp[0] = 1
        for (coin in coins) {
            for (a in 1..amount) {
                if (a - coin >= 0) {
                    dp[a] += dp[a - coin]
                }
            }
        }
        return dp[amount]
    }
}

fun main() {
    val coins = intArrayOf(1, 2, 5)
    val amount = 5
    val solutionKt = SolutionKt2()
    val result = solutionKt.change(amount, coins)
    println(result)
}
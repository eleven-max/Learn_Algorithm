package dp.coinChange

//https://leetcode-cn.com/problems/coin-change/
class SolutionKt {

    fun coinChange(coins: IntArray, amount: Int): Int {
        val memory = IntArray(amount + 1) { Int.MAX_VALUE }
        return dfs(coins, amount, memory)
    }

    private fun dfs(coins: IntArray, amount: Int, memory: IntArray): Int {
        if (amount < 0) return -1
        if (amount == 0) return 0

        if (memory[amount] != Int.MAX_VALUE) {
            return memory[amount]
        }
        var r = Int.MAX_VALUE
        for (i in coins) {
            val temp = dfs(coins, amount - i, memory)
            if (temp >= 0) {
                r = Math.min(r, temp + 1)
            }
        }
        if (r == Int.MAX_VALUE) {
            memory[amount] = -1
        } else {
            memory[amount] = r
        }

        return memory[amount]
    }
}
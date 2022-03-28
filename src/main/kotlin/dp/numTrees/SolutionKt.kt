package dp.numTrees

//https://leetcode-cn.com/problems/unique-binary-search-trees/
class SolutionKt {

    fun numTrees(n: Int): Int {
        val dp = IntArray(n + 1) { 0 }
        dp[0] = 1
        dp[1] = 1
        for (i in 2..n) {
            for (j in 1..i) {
                dp[i] += dp[j - 1] * dp[i - j]
            }
        }
        return dp[n]
    }
}
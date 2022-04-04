package dp.minPathSum

//https://leetcode-cn.com/problems/minimum-path-sum/
class SolutionKt {
    fun minPathSum(grid: Array<IntArray>): Int {
        val dp = Array(grid.size) { IntArray(grid[0].size) { 0 } }
        dp[0][0] = grid[0][0]
        //第一列
        for (i in 1 until dp.size) {
            dp[i][0] = grid[i][0] + dp[i - 1][0]
        }
        for (i in 1 until dp[0].size) {
            dp[0][i] = grid[0][i] + dp[0][i - 1]
        }

        for (i in 1 until dp.size) {
            for (j in 1 until dp[0].size) {
                dp[i][j] = Math.min(dp[i][j-1], dp[i-1][j]) + grid[i][j]
            }
        }

        return dp[dp.size - 1][dp[0].size - 1]
    }
}
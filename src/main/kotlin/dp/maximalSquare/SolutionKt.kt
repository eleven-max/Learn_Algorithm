package dp.maximalSquare

import com.evan.dynamicprogramming.Common.CommonUtil

//https://leetcode-cn.com/problems/maximal-square/
class SolutionKt {
    fun maximalSquare(matrix: Array<CharArray>): Int {
        val dp = Array(matrix.size) { IntArray(matrix[0].size) { 0 } }
        var r = 0
        //第一行
        for (i in 0 until matrix[0].size) {
            dp[0][i] = if ('1' == matrix[0][i]) 1 else 0
            r = Math.max(r, dp[0][i])
        }
        CommonUtil.printMatrix(dp)
        //第一列
        for (i in 1 until matrix.size) {
            dp[i][0] = if ('1' == matrix[i][0]) 1 else 0
            r = Math.max(r, dp[i][0])
        }

        for (i in 1 until matrix.size) {
            for (j in 1 until matrix[0].size) {
                if ('0' == matrix[i][j]) {
                    dp[i][j] = 0
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]) + 1
                }
                r = Math.max(r, dp[i][j])
            }
        }

        CommonUtil.printMatrix(dp)
        return r
    }
}

fun main() {
    val matrix: Array<CharArray> = arrayOf(charArrayOf('1'), charArrayOf('0'))
    val solutionKt = SolutionKt()
    solutionKt.maximalSquare(matrix)
}
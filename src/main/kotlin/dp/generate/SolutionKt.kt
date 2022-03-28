package dp.generate

import com.evan.dynamicprogramming.Common.CommonUtil

//https://leetcode-cn.com/problems/pascals-triangle/
class SolutionKt {
    fun generate(numRows: Int): List<List<Int>> {
        val dp = mutableListOf<MutableList<Int>>()
        for (row in 0 until numRows) {
            val rowList = MutableList(row + 1) { 0 }
            for (col in 0..row) {
                if (col == 0 || col == row) {
                    rowList[col] = 1
                } else {
                    rowList[col] = dp[row-1][col-1] + dp[row-1][col]
                }
            }
            dp.add(rowList)
        }

        return dp
    }
}

fun main(){
    val solutionKt = SolutionKt()
    val dp = solutionKt.generate(5)
    println(dp)
}
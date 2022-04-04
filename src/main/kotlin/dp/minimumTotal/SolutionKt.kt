package dp.minimumTotal
//https://leetcode-cn.com/problems/triangle/
class SolutionKt {

    fun minimumTotal(triangle: List<List<Int>>): Int {
        val endI = triangle.size -1
        val dp = Array(triangle.size) { IntArray(triangle[endI].size) { 0 } }
        for (i in 0 until triangle[endI].size){
            dp[endI][i] = triangle[endI][i]
        }

        for (i in endI downTo 1){
            for (j in 0 until triangle[i].size-1){
                dp[i-1][j] = Math.min(dp[i][j], dp[i][j+1]) + triangle[i-1][j]
            }
        }

        return dp[0][0]
    }
}

package dp.numberOfArithmeticSlices

//https://leetcode-cn.com/problems/arithmetic-slices/
class SolutionKt {

    fun numberOfArithmeticSlices(nums: IntArray): Int {
        val dp = Array(2) { IntArray(nums.size) { 0 } }
        dp[0][0] = 0
        //第一行计算等差多少
        for (i in 1 until nums.size) {
            dp[0][i] = nums[i] - nums[i-1]
        }
        //计算有多少个等差子数组
        var r = 0

        for (i in 2 until dp[0].size){
            dp[1][i] = if (dp[0][i] == dp[0][i-1]) dp[1][i-1] + 1 else 0
            r += dp[1][i]
        }

        return r
    }
}
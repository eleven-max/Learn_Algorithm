package dp.rob

import java.lang.Integer.max

//https://leetcode-cn.com/problems/house-robber-ii/
class SolutionKt {
    fun rob(nums: IntArray): Int {
        if(nums.size == 1){
            return nums[0]
        }
        val v1 = rob(nums, 0, nums.size-2)
        val v2 = rob(nums, 1, nums.size-1)
        return max(v1,v2)
    }

    private fun rob(nums: IntArray, i: Int, j: Int): Int {
        val dp = Array(2) {
            Array(j  +1) { 0 }
        }
        dp[0][i] = nums[i]
        dp[1][i] = 0
        for (p in i+1..j){
            dp[0][p] = dp[1][p-1] + nums[p]
            dp[1][p] = max(dp[0][p-1], dp[1][p-1])
        }
        return max(dp[0][j], dp[1][j])
    }
}
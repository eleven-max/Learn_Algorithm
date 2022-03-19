package dp.deleteAndEarn

import com.evan.dynamicprogramming.Common.CommonUtil

//https://leetcode-cn.com/problems/delete-and-earn/
class SolutionKt {

    fun deleteAndEarn(nums: IntArray): Int {
        val array = IntArray(10001) { 0 }
        for (i in nums) {
            array[i] += i
        }
        return rob(array)
    }

    private fun rob(nums: IntArray): Int {
        val dp = IntArray(nums.size){0}
        dp[0] = nums[0]
        dp[1] = Math.max(nums[0], nums[1])
        for (i in 2 until nums.size){
            dp[i] = Math.max(dp[i-1], nums[i]+dp[i-2])
        }
        return dp[dp.size-1]
    }
}
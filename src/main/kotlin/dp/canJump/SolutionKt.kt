package dp.canJump

import com.evan.dynamicprogramming.Common.CommonUtil

class SolutionKt {
    fun canJump(nums: IntArray): Boolean {
        if (nums.size < 2) return true
        if(nums[0] == 0) return false
        val dp = IntArray(nums.size) { 0 }
        dp[0] = 1
        for (i in nums.indices) {
            if(dp[i] == 0) return false
            for (k in 1..nums[i]) {
                if (i+k < nums.size && dp[i + k] != 1) {
                    dp[i + k] = 1
                }
            }
        }
        return true
    }
}
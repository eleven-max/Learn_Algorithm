package dp.numDecodings

import com.evan.dynamicprogramming.Common.CommonUtil

//https://leetcode-cn.com/problems/decode-ways/
class SolutionKt {

    fun numDecodings(s: String): Int {
        if (s[0] == '0') return 0
        val nums = IntArray(s.length+1){0}
        for (i in s.indices) {
            nums[i+1] = s[i] - '0'
        }
//        CommonUtil.printArray(nums)
        val dp = IntArray(nums.size) { 0 }
        dp[0] = 1
        for (i in 1 until nums.size) {
            if (nums[i] != 0) {
                dp[i] += dp[i - 1]
            }
            if (nums[i - 1] != 0 && (nums[i - 1] * 10 + nums[i]) <= 26) {
                dp[i] += dp[i - 2]
            }
        }
//        CommonUtil.printArray(dp)
        return dp[dp.size - 1]
    }
}
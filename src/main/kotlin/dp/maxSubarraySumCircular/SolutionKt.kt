package dp.maxSubarraySumCircular

import com.evan.dynamicprogramming.Common.CommonUtil

class SolutionKt {
    fun maxSubarraySumCircular(nums: IntArray): Int {
        val dpMax = IntArray(nums.size){0}
        val dpMin = IntArray(nums.size){0}
        dpMax[0] = nums[0]
        dpMin[0] = nums[0]
        var maxR = nums[0]
        var minR = nums[0]
        var sum = nums[0]
        for (i in 1 until nums.size){
            dpMax[i] = Math.max(dpMax[i-1] +nums[i], nums[i])
            maxR = Math.max(maxR, dpMax[i])

            dpMin[i] = Math.min(dpMin[i-1] + nums[i], nums[i])
            minR = Math.min(minR, dpMin[i])

            sum += nums[i]
        }

        return if(maxR < 0) maxR else Math.max(maxR, sum - minR)
    }
}
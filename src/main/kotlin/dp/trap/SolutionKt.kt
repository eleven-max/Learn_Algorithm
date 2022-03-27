package dp.trap

import com.evan.dynamicprogramming.Common.CommonUtil

//https://leetcode-cn.com/problems/trapping-rain-water/
class SolutionKt {
    fun trap(height: IntArray): Int {
        val leftMax = IntArray(height.size){0}
        val rightMax = IntArray(height.size){0}

        leftMax[0] = height[0]
        for (i in 1 until height.size){
            leftMax[i] = Math.max(height[i], leftMax[i-1])
        }

        val endIndex = height.size - 1
        rightMax[endIndex] = height[endIndex]
        for (i in endIndex-1 downTo 0){
            rightMax[i] = Math.max(rightMax[i+1], height[i])
        }

        var r = 0
        for (i in 1 until endIndex){
            val temp = Math.min(leftMax[i-1], rightMax[i+1]) - height[i]
            if(temp > 0){
                r += temp
            }
        }

        return r
    }
}

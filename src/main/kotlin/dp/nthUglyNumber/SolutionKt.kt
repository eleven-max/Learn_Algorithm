package dp.nthUglyNumber

import com.evan.dynamicprogramming.Common.CommonUtil
import java.util.*
import kotlin.collections.HashSet
import kotlin.math.min

//https://leetcode-cn.com/problems/ugly-number-ii/
class SolutionKt {
    fun nthUglyNumber(n: Int): Int {
        val factors = intArrayOf(2, 3, 5)
        val set = HashSet<Long>()
        val minHeap = PriorityQueue<Long>()
        set.add(1)
        minHeap.add(1)
        var r = 0
        for (i in 0 until n) {
            val curr = minHeap.poll()
            r = curr.toInt()
            for (fact in factors) {
                val temp = fact * curr
                if (set.add(temp)) {
                    minHeap.add(temp)
                }
            }
        }
        return r
    }
}
package dp.maxSubArray

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class maxSubArrayTest {

    @Test
    fun test(){
        val solutionKt = SolutionKt()
        val nums = intArrayOf(-2,1,-3,4,-1,2,1,-5,4)
        Assertions.assertEquals(6, solutionKt.maxSubArray(nums))
    }

    @Test
    fun test2(){
        val solutionKt = SolutionKt()
        val nums = intArrayOf(5,4,-1,7,8)
        Assertions.assertEquals(23, solutionKt.maxSubArray(nums))
    }
}
package dp.deleteAndEarn

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class deleteAndEarnTest {

    @Test
    fun test(){
        val nums = intArrayOf(3,4,2)
        val solution = SolutionKt()
        val result = solution.deleteAndEarn(nums)
        Assertions.assertEquals(6, result)
    }

    @Test
    fun test2(){
        val nums = intArrayOf(2,2,3,3,3,4)
        val solution = SolutionKt()
        val result = solution.deleteAndEarn(nums)
        Assertions.assertEquals(9, result)
    }
}
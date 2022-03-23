package dp.getMaxLen

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class getMaxLenTest {

    @Test
    fun test(){
        val solutionKt = SolutionKt()
        val nums = intArrayOf(1,-2,-3,4)
        Assertions.assertEquals(4,solutionKt.getMaxLen(nums))
    }

    @Test
    fun test2(){
        val solutionKt = SolutionKt()
        val nums = intArrayOf(0,1,-2,-3,-4)
        Assertions.assertEquals(3,solutionKt.getMaxLen(nums))
    }

    @Test
    fun test3(){
        val solutionKt = SolutionKt()
        val nums = intArrayOf(-1,-2,-3,0,1)
        Assertions.assertEquals(2,solutionKt.getMaxLen(nums))
    }
}
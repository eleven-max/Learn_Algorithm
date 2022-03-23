package dp.maxProduct

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class maxProductTest {

    @Test
    fun test() {
        val solutionKt = SolutionKt()
        val nums = intArrayOf(2,3,-2,4)
        Assertions.assertEquals(6, solutionKt.maxProduct(nums))
    }

    @Test
    fun test2() {
        val solutionKt = SolutionKt()
        val nums = intArrayOf(-2,0,-1)
        Assertions.assertEquals(0, solutionKt.maxProduct(nums))
    }

    @Test
    fun test3() {
        val solutionKt = SolutionKt()
        val nums = intArrayOf(-2,-3,-1)
        Assertions.assertEquals(6, solutionKt.maxProduct(nums))
    }

    @Test
    fun test4() {
        val solutionKt = SolutionKt()
        val nums = intArrayOf(-2,3,-4)
        Assertions.assertEquals(24, solutionKt.maxProduct(nums))
    }
}
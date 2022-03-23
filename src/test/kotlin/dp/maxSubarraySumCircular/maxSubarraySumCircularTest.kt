package dp.maxSubarraySumCircular

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class maxSubarraySumCircularTest {
    @Test
    fun test() {
        val solutionKt = SolutionKt()
        val nums = intArrayOf(1,-2,3,-2)
        Assertions.assertEquals(3, solutionKt.maxSubarraySumCircular(nums))
    }

    @Test
    fun test2() {
        val solutionKt = SolutionKt()
        val nums = intArrayOf(5,-3,5)
        Assertions.assertEquals(10, solutionKt.maxSubarraySumCircular(nums))
    }

    @Test
    fun test3() {
        val solutionKt = SolutionKt()
        val nums = intArrayOf(3,-2,2,-3)
        Assertions.assertEquals(3, solutionKt.maxSubarraySumCircular(nums))
    }

    @Test
    fun test4(){
        val solutionKt = SolutionKt()
        val nums = intArrayOf(1,2,3,4,5)
        Assertions.assertEquals(15, solutionKt.maxSubarraySumCircular(nums))
    }

    @Test
    fun test5(){
        val solutionKt = SolutionKt()
        val nums = intArrayOf(2,-2,2,7,8,0)
        Assertions.assertEquals(19, solutionKt.maxSubarraySumCircular(nums))
    }

    @Test
    fun test6(){
        val solutionKt = SolutionKt()
        val nums = intArrayOf(2,0)
        Assertions.assertEquals(2, solutionKt.maxSubarraySumCircular(nums))
    }

    @Test
    fun test7(){
        val solutionKt = SolutionKt()
        val nums = intArrayOf(0)
        Assertions.assertEquals(0, solutionKt.maxSubarraySumCircular(nums))
    }

    @Test
    fun test8(){
        val solutionKt = SolutionKt()
        val nums = intArrayOf(2)
        Assertions.assertEquals(2, solutionKt.maxSubarraySumCircular(nums))
    }

    @Test
    fun test9(){
        val solutionKt = SolutionKt()
        val nums = intArrayOf(-2)
        Assertions.assertEquals(-2, solutionKt.maxSubarraySumCircular(nums))
    }

    @Test
    fun test10(){
        val solutionKt = SolutionKt()
        val nums = intArrayOf(-2,-1,-1)
        Assertions.assertEquals(-1, solutionKt.maxSubarraySumCircular(nums))
    }
}
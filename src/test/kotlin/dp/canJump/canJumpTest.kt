package dp.canJump

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class canJumpTest {

    @Test
    fun test() {
        val solution = SolutionKt()
        val nums = intArrayOf(2,3,1,1,4)
        Assertions.assertEquals(true, solution.canJump(nums))
    }

    @Test
    fun test2() {
        val solution = SolutionKt()
        val nums = intArrayOf(3,2,1,0,4)
        Assertions.assertEquals(false, solution.canJump(nums))
    }

    @Test
    fun test3() {
        val solution = SolutionKt()
        val nums = intArrayOf(2)
        Assertions.assertEquals(true, solution.canJump(nums))
    }

    @Test
    fun test4() {
        val solution = SolutionKt()
        val nums = intArrayOf(0)
        Assertions.assertEquals(true, solution.canJump(nums))
    }

    @Test
    fun test5() {
        val solution = SolutionKt()
        val nums = intArrayOf(0,1,2,0,0,0)
        Assertions.assertEquals(false, solution.canJump(nums))
    }

    @Test
    fun test6() {
        val solution = SolutionKt()
        val nums = intArrayOf(1,0,1,0)
        Assertions.assertEquals(false, solution.canJump(nums))
    }

    @Test
    fun test7() {
        val solution = SolutionKt()
        val nums = intArrayOf(2,0,0)
        Assertions.assertEquals(true, solution.canJump(nums))
    }
}
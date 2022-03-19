package dp.rob

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class robTest {

    @Test
    fun test(){
        val solution: SolutionKt = SolutionKt()
        val nums = intArrayOf(2,3,2)
        Assertions.assertEquals(3, solution.rob(nums))
    }

    @Test
    fun test2(){
        val solution: SolutionKt = SolutionKt()
        val nums = intArrayOf(2,3)
        Assertions.assertEquals(3, solution.rob(nums))
    }

    @Test
    fun test3(){
        val solution: SolutionKt = SolutionKt()
        val nums = intArrayOf(3)
        Assertions.assertEquals(3, solution.rob(nums))
    }

    @Test
    fun test4(){
        val solution: SolutionKt = SolutionKt()
        val nums = intArrayOf(1,2,3)
        Assertions.assertEquals(3, solution.rob(nums))
    }

    @Test
    fun test5(){
        val solution: SolutionKt = SolutionKt()
        val nums = intArrayOf(1,2,3,1)
        Assertions.assertEquals(4, solution.rob(nums))
    }
}
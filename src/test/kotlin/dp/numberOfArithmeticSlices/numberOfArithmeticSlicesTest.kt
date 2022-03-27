package dp.numberOfArithmeticSlices

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class numberOfArithmeticSlicesTest {

    lateinit var solutionKt: SolutionKt

    @BeforeAll
    fun before(){
        solutionKt = SolutionKt()
    }

    @Test
    fun test(){
        val nums = intArrayOf(1,2,3,4)
        Assertions.assertEquals(3, solutionKt.numberOfArithmeticSlices(nums))
    }

    @Test
    fun test1(){
        val nums = intArrayOf(1,2,3)
        Assertions.assertEquals(1, solutionKt.numberOfArithmeticSlices(nums))
    }

    @Test
    fun test2(){
        val nums = intArrayOf(1)
        Assertions.assertEquals(0, solutionKt.numberOfArithmeticSlices(nums))
    }

    @Test
    fun test3(){
        val nums = intArrayOf(1,2)
        Assertions.assertEquals(0, solutionKt.numberOfArithmeticSlices(nums))
    }

    @Test
    fun test4(){
        val nums = intArrayOf(1,2,5)
        Assertions.assertEquals(0, solutionKt.numberOfArithmeticSlices(nums))
    }

    @Test
    fun test5(){
        val nums = intArrayOf(5,5,5,5)
        Assertions.assertEquals(3, solutionKt.numberOfArithmeticSlices(nums))
    }

    @Test
    fun test6(){
        val nums = intArrayOf(5,5,5,1,2,3)
        Assertions.assertEquals(2, solutionKt.numberOfArithmeticSlices(nums))
    }
}
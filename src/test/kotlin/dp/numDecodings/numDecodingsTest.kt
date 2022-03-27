package dp.numDecodings

import dp.numDecodings.SolutionKt
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class numDecodingsTest {


    lateinit var solutionKt: SolutionKt

    @BeforeAll
    fun before(){
        solutionKt = SolutionKt()
    }

    @Test
    fun test(){
        val s = "12"
        Assertions.assertEquals(2, solutionKt.numDecodings(s))
    }

    @Test
    fun test2(){
        val s = "0000"
        Assertions.assertEquals(0, solutionKt.numDecodings(s))
    }

    @Test
    fun test3(){
        val s = "0010"
        Assertions.assertEquals(0, solutionKt.numDecodings(s))
    }

    @Test
    fun test4(){
        val s = "10"
        Assertions.assertEquals(1, solutionKt.numDecodings(s))
    }

    @Test
    fun test5(){
        val s = "226"
        Assertions.assertEquals(3, solutionKt.numDecodings(s))
    }

    @Test
    fun test6(){
        val s = "0"
        Assertions.assertEquals(0, solutionKt.numDecodings(s))
    }

    @Test
    fun test7(){
        val s = "2"
        Assertions.assertEquals(1, solutionKt.numDecodings(s))
    }

    @Test
    fun test8(){
        val s = "11106"
        Assertions.assertEquals(2, solutionKt.numDecodings(s))
    }

    @Test
    fun test9(){
        val s = "27"
        Assertions.assertEquals(1, solutionKt.numDecodings(s))
    }


    @Test
    fun test10(){
        val s = "26110"
        Assertions.assertEquals(2, solutionKt.numDecodings(s))
    }
    @Test
    fun test11(){
        val s = "2611055971756562"
        Assertions.assertEquals(4, solutionKt.numDecodings(s))
    }

}
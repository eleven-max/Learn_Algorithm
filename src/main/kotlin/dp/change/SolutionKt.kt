package dp.change

//https://leetcode-cn.com/problems/coin-change-2/
class SolutionKt {
    //备忘录方法无法解决
    fun change(amount: Int, coins: IntArray): Int {
        val memory = IntArray(amount+1){ Int.MAX_VALUE}
        return dfs(amount, coins, 0, "" ,memory)
    }

    private fun dfs(amount: Int, coins: IntArray, index: Int, path: String, memory: IntArray): Int {
        if(amount < 0) return -1
        if(amount == 0){
            println(path)
            return 1
        }
        if(memory[amount] != Int.MAX_VALUE){
            return memory[amount]
        }
        println(amount)
        var r = 0
        for (i in index until coins.size) {
            val temp = dfs(amount-coins[i], coins, i, path+"|"+coins[i], memory)
            if(temp >0){
                r += temp
            }
        }
        memory[amount] = r
        return r
    }
}

fun main(){
    val coins = intArrayOf(1,2,5)
    val amount = 3
    val solutionKt = SolutionKt()
    val result = solutionKt.change(amount, coins)
    println(result)
}
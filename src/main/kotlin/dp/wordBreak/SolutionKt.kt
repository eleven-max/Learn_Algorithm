package dp.wordBreak
//https://leetcode-cn.com/problems/word-break/
class SolutionKt {

    fun wordBreak(s: String, wordDict: List<String>): Boolean {
        val wordSet = HashSet<String>()
        for (word in wordDict){
            wordSet.add(word)
        }
        val memory = Array<Boolean?>(s.length){null}
        return findWay(s, 0, wordSet, "", memory)
    }

    private fun findWay(s: String, index: Int, words: HashSet<String>, path: String, memory: Array<Boolean?>) : Boolean {

        if(index == s.length){
            return true
        }

        if(memory[index] != null){
            return memory[index]!!
        }
        println("$index-->$path")
        val sb = StringBuilder()
        for (i in index until s.length){
            sb.append(s[i])
            if(words.contains(sb.toString())){
                val temp = findWay(s, i+1, words, "$path | ${sb.toString()}", memory)
                if(temp) {
                    memory[index] = true
                    return true
                }
            }
        }
        memory[index] = false
        return memory[index]!!
    }
}

fun main(){
    val solutionKt = SolutionKt()
    val s = "leetcode"
    val wordDict = listOf("leet", "code")
    val r = solutionKt.wordBreak(s, wordDict)
    println(r)
}
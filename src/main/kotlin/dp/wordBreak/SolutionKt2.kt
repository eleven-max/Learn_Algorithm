package dp.wordBreak

class SolutionKt2 {

    fun wordBreak(s: String, wordDict: List<String>): Boolean {
        val wordSet = HashSet<String>()
        for (word in wordDict){
            wordSet.add(word)
        }
        val memory = Array<Boolean?>(s.length){null}
        return findWay(s, 0, wordSet, memory)
    }

    private fun findWay(s: String, index: Int, words: HashSet<String>,  memory: Array<Boolean?>) : Boolean {
        if(index == s.length){
            return true
        }
        if(null != memory[index]){
            return memory[index]!!
        }

        val sb = StringBuilder()
        for (i in index until s.length){
            sb.append(s[i])
            if(words.contains(sb.toString())){
                val temp = findWay(s, i+1, words, memory)
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
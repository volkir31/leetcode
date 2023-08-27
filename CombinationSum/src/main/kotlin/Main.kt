// Task: https://leetcode.com/problems/combination-sum/
fun main() {
    println(combinationSum(intArrayOf(2, 3, 5), 8))
}

fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
    val ans = mutableListOf<List<Int>>()
    val candidate = mutableListOf<Int>()

    fun dfs(i: Int, target: Int) {
        if (target == 0) {
            ans.add(candidate.toList())
            return
        }
        if (target < 0 || i >= candidates.size) return
        candidate.add(candidates[i])
        dfs(i, target - candidates[i])
        candidate.remove(candidates[i])
        dfs(i + 1, target)
    }

    dfs(0, target)
    return ans
}

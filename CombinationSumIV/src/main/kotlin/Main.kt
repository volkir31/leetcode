// Task - https://leetcode.com/problems/combination-sum-iv/
fun main() {
    println(combinationSum4(intArrayOf(1, 2, 3), 4))
//    println(combinationSum4(intArrayOf(9), 3))
}

fun combinationSum4(nums: IntArray, target: Int): Int {
    val dp = IntArray(target + 1)
    dp[0] = 1

    for(i in 1 .. target) {
        for(num in nums){
            if (i >= num) {
                dp[i] += dp[i - num]
            }
        }
    }

    return dp[target]
}

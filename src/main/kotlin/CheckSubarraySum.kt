// https://leetcode.com/problems/continuous-subarray-sum/?envType=daily-question&envId=2024-06-08
fun main() {
    val nums = intArrayOf(23, 2, 4, 6, 7)
    val k = 6
    println(checkSubarraySum(nums, k))
}

fun checkSubarraySum(nums: IntArray, k: Int): Boolean {
    val prefixSums = mutableSetOf<Int>()
    var prevPrefixSum = 0
    nums.forEach {
        val prefixSum = (prevPrefixSum + it) % k
        if (prefixSum in prefixSums) {
            return true
        }

        prefixSums.add(prevPrefixSum)
        prevPrefixSum = prefixSum
    }

    return false
}
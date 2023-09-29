// Task - https://leetcode.com/problems/monotonic-array/
fun main() {
    println(isMonotonic(intArrayOf(1, 3, 2)))
    println(isMonotonic(intArrayOf(1, 2, 4, 5)))
}

fun isMonotonic(nums: IntArray): Boolean {
    val increase = nums[0] >= nums.last()
    for (i in (0 until nums.lastIndex)) {
        if (increase) {
            if (nums[i] < nums[i + 1]) return false
            continue
        }

        if (nums[i] > nums[i + 1]) return false
    }

    return true
}
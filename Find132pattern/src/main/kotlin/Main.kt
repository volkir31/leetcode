// Task - https://leetcode.com/problems/132-pattern/
fun main() {
    println(find132pattern(intArrayOf(1, 2, 3, 4))) //false
    println(find132pattern(intArrayOf(3, 1, 4, 2))) //true
    println(find132pattern(intArrayOf(-1, 3, 2, 0))) //true
}

fun find132pattern(nums: IntArray): Boolean {
    var l = 0
    var r = nums.lastIndex
    while (l < r) {
        if (l < r) {

        } else {
            
        }
    }

    return false
}
//nums[i] < nums[k] < nums[j]
// Task https://leetcode.com/problems/search-insert-position/
fun main() {
    println(searchInsert(intArrayOf(1,3,5,6), 5))
    println(searchInsert(intArrayOf(1,3,5,6), 2))
}

fun searchInsert(nums: IntArray, target: Int): Int {
    nums.forEachIndexed { index, number ->
        if (number >= target) {
            return index
        }
    }
    return nums.size
}
// Task https://leetcode.com/problems/remove-duplicates-from-sorted-array/
fun main() {
    val nums = intArrayOf(1,1,2)
    println(removeDuplicates(nums))
    println(nums.toList())
}

fun removeDuplicates(nums: IntArray): Int {
    var prev = nums.first()
    var counter = 0
    nums.drop(1).forEachIndexed { index, i ->
        if (prev == i) return@forEachIndexed
        counter++
        nums[counter] = i
        prev = i
    }

    return ++counter
}
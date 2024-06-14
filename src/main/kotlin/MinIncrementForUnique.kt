// https://leetcode.com/problems/minimum-increment-to-make-array-unique/description/
fun main() {
    val nums = intArrayOf(1, 2, 2)
    val nums1 = intArrayOf(3,2,1,2,1,7)
    println(minIncrementForUnique(nums))
    println(minIncrementForUnique(nums1))
}

fun minIncrementForUnique(nums: IntArray): Int {
    val map = HashSet<Int>()
    var countOperations = 0
    for (num in nums.sorted()) {
        var increment = 0
        while (num + increment in map) {
            countOperations++
            increment++
        }
        map.add(num + increment)
    }

    return countOperations
}
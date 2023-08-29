// Task https://leetcode.com/problems/search-in-rotated-sorted-array/
fun main() {
    println(search(intArrayOf(4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 1, 2), 11))
}

fun search(nums: IntArray, target: Int): Int {
    var mid = nums.size / 2
    var pivot: Int
    while (nums[mid] > nums.last()) {
        pivot = (nums.lastIndex - mid) / 2
        mid += pivot
    }

    if (target < nums[mid]) return -1
    if (target < nums.first() && target > nums.last()) return -1
    val realMid = mid
    var arr = nums.toList()
    while (true) {
        if (target == nums[mid]) return mid
        mid = if (target <= arr.last()) {
            arr = arr.slice(mid..arr.lastIndex)
            mid + (nums.lastIndex - mid) / 2
        } else {
            arr = arr.slice(0..mid)
            mid / 2
        }
    }



    return -1
}
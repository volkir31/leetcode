// Task https://leetcode.com/problems/minimum-replacements-to-sort-the-array/
fun main() {
    println(minimumReplacement(intArrayOf(2,10,20,19,1))) // 47
    println(minimumReplacement(intArrayOf(3,9,3))) // 2
    println(minimumReplacement(intArrayOf(12,9,7,6,17,19,21))) // 6
}

fun minimumReplacement(nums: IntArray): Long {
    var replacementCount = 0L
    var currentElement = nums.last()
    for (idx in (nums.lastIndex - 1 downTo 0)) {
        if (nums[idx] <= currentElement) {
            currentElement = nums[idx]
            continue
        }
        if (nums[idx] % currentElement == 0) {
            replacementCount += nums[idx] / currentElement - 1
            continue
        }
        replacementCount += nums[idx] / currentElement
        currentElement--
        while (nums[idx] % currentElement > nums[idx] / currentElement) {
            currentElement--
        }
    }
    return replacementCount
}
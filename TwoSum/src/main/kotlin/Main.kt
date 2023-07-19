
fun main() {
    println( twoSum(intArrayOf(2,7,11,15), 9).toList())
}
fun twoSum(nums: IntArray, target: Int): IntArray {
    nums.forEachIndexed { idx, value ->
        nums.slice(idx + 1..nums.lastIndex).forEachIndexed { index, v ->
            if (value + v == target) {
                return intArrayOf(idx, idx + index + 1)
            }
        }
    }

    return nums
}
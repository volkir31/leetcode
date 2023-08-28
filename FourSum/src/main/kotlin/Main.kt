// Task https://leetcode.com/problems/4sum/
fun main() {
//    println(fourSum(intArrayOf(1, 0, -1, 0, -2, 2), 0)) // [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
//    println(fourSum(intArrayOf(2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2), 8)) // [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
    println(fourSum(intArrayOf(1000000000,1000000000,1000000000,1000000000), -294967296))
    println(fourSum(intArrayOf(2,1,0,-1), 2))
}

fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
    val ans = mutableSetOf<List<Int>>()
    if (nums.size < 4) return listOf()
    nums.sort()
    nums.forEachIndexed { idx, num ->
        var left = idx + 1
        var right = nums.lastIndex
        while (left < right) {
            (left + 1 until right).forEach { middle ->
                val sum = num.toLong() + nums[left] + nums[right] + nums[middle]
                if (ans.isNotEmpty()) {
                    val first = ans.first()
                    if (first[0] == num && first[1] == nums[left] && first[2] == nums[right] && nums[middle] == first[3]) return@forEach
                }

                if (sum == target.toLong()) {
                    ans.add(listOf(num, nums[left], nums[right], nums[middle]).sorted())
                }
            }
            right--
            if (right == left + 1) {
                right = nums.lastIndex
                left++
            }
        }
    }
    return ans.toList()
}
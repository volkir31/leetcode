// Task - https://leetcode.com/problems/sort-array-by-parity/
fun main() {
    println(sortArrayByParity(intArrayOf(3, 1, 2, 4)).toList())
    println(sortArrayByParity(intArrayOf(0)).toList())
}

fun sortArrayByParity(nums: IntArray): IntArray {
    val numbers = nums.toMutableList()
    var floatedIndex = 0
    numbers.forEachIndexed { index, i ->
        if (i % 2 == 0) numbers[floatedIndex] =
            numbers[index].also { numbers[index] = numbers[floatedIndex] }.also { floatedIndex++ }
    }

    return numbers.toIntArray()
}
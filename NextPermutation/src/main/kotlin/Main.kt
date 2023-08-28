// Task https://leetcode.com/problems/next-permutation/
fun main() {
//    val list = intArrayOf(1, 2, 3)
//    nextPermutation(list)
//    println(list.toList())
//    val list2 = intArrayOf(3, 2, 1)
//    nextPermutation(list2)
//    println(list2.toList())
//    val list3 = intArrayOf(1, 2)
//    nextPermutation(list3)
//    println(list3.toList())
//    val list4 = intArrayOf(1, 3, 2)
//    nextPermutation(list4)
//    println(list4.toList())
//    val list5 = intArrayOf(2, 3, 1)
//    nextPermutation(list5)
//    println(list5.toList())
//    val list6 = intArrayOf(1, 5, 1)
//    nextPermutation(list6)
//    println(list6.toList())
    val list7 = intArrayOf(2, 1, 3)
    nextPermutation(list7)
    println(list7.toList())
}

fun nextPermutation(nums: IntArray): Unit {
    var idx = nums.lastIndex
    while (idx > 0) {
        if (nums[idx] > nums[idx - 1]) {
            nums.sort(idx)
            nums.replaceMax(idx, idx - 1)
            return
        }
        idx--
    }
    nums.sort()
}

fun IntArray.sort(from: Int) {
    (from..lastIndex).forEach { first ->
        (from..lastIndex).forEach { second ->
            if (this[first] < this[second]) {
                this[second] = this[first].also { this[first] = this[second] }
            }
        }
    }
}

fun IntArray.replaceMax(from: Int, replacedIndex: Int) {
    val idx = this.slice(from..lastIndex).indexOf(this.slice(from..lastIndex).filter { it > this[replacedIndex] }.min())
    this[replacedIndex] = this[from + idx].also { this[from + idx] = this[replacedIndex] }
}
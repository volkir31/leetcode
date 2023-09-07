// Task - https://leetcode.com/problems/check-if-matrix-is-x-matrix/description/
fun main() {
//    println(
//        checkXMatrix(
//            arrayOf(
//                intArrayOf(2, 0, 0, 1),
//                intArrayOf(0, 3, 1, 0),
//                intArrayOf(0, 5, 2, 0),
//                intArrayOf(4, 0, 0, 2)
//            )
//        )
//    )
//    println(
//        checkXMatrix(
//            arrayOf(
//                intArrayOf(5, 7, 0),
//                intArrayOf(0, 3, 1),
//                intArrayOf(0, 5, 0),
//            )
//        )
//    )
    println(
        checkXMatrix(
            arrayOf(
                intArrayOf(5,0,20),
                intArrayOf(0,5,0),
                intArrayOf(6,0,2),
            )
        )
    )
}

fun checkXMatrix(grid: Array<IntArray>): Boolean {
    val size = grid.lastIndex
    grid.forEachIndexed { idx, ints ->
        if (ints[size - idx] == 0 || ints[idx] == 0) return false
        val sum = if (size - idx != idx) ints[idx] + ints[size - idx] else ints[idx]
        if (ints.sum() != sum) return false
    }
    return true
}
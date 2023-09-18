// Task - https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix

fun main() {
    val matrix = arrayOf(
        intArrayOf(1, 1, 0, 0, 0),
        intArrayOf(1, 1, 1, 1, 0),
        intArrayOf(1, 0, 0, 0, 0),
        intArrayOf(1, 1, 0, 0, 0),
        intArrayOf(1, 1, 1, 1, 1)
    )
    println(kWeakestRows(matrix, 3).toList())
}

fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray {
    return mat.mapIndexed { idx, value -> idx to value }.sortedBy { it.second.sum() }.slice(0 until k).map { it.first }.toIntArray()
}
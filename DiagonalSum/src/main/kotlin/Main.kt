// Task - https://leetcode.com/problems/matrix-diagonal-sum
fun main() {
    println(diagonalSum(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))))
}

fun diagonalSum(mat: Array<IntArray>): Int {
    return mat.foldIndexed(0) { index, acc, ints ->
        if (index != ints.lastIndex - index) acc + ints[index] + ints[ints.lastIndex - index] else acc + ints[index]
    }
}
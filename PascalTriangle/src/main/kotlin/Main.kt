// Task - https://leetcode.com/problems/pascals-triangle
fun main() {
    println(generate(5))
}

fun generate(numRows: Int): List<List<Int>> {
    val ans = MutableList(numRows) { MutableList(it + 1) { 1 } }
    for (idx in (0 until numRows)) {
        repeat(idx) { if (it != 0 && it != idx) ans[idx][it] = ans[idx - 1][it] + ans[idx - 1][it - 1] }
    }

    return ans
}
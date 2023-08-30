import kotlin.math.max
import kotlin.math.min

// Task https://leetcode.com/problems/zigzag-conversion/
fun main() {
    println(convert("PAYPALISHIRING", 3)) // PAHNAPLSIIGYIR
    println(convert("AB", 1))
}

fun convert(s: String, numRows: Int): String {
    val ans = mutableListOf<MutableList<Char>>()
    repeat(numRows) {
        ans.add(mutableListOf())
    }
    if (numRows == 1) return s
    var counter = 0
    var reversed = false
    s.forEachIndexed { index, c ->
        ans[counter].add(c)
        if (index % (numRows - 1) == 0) {
            reversed = !reversed
        }
        counter += if (reversed) 1 else -1
    }
    return ans.fold("") {acc, chars ->
        "$acc${chars.joinToString("")}"
    }
}
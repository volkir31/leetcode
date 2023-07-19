// Task https://leetcode.com/problems/roman-to-integer/
fun main() {
//    println(romanToInt("MCMXCIV"))
    println(romanToInt("IV"))
}

fun romanToInt(s: String): Int {
    var prev = s.first().romanToInt()
    return s.fold(0) { acc, c ->
        val current = c.romanToInt()
        val res = if (current > prev) {
            acc + current - 2 * prev
        } else {
            acc + current
        }
        prev = current
        res
    }
}

fun Char.romanToInt() = when (this) {
    'I' -> 1
    'V' -> 5
    'X' -> 10
    'L' -> 50
    'C' -> 100
    'D' -> 500
    'M' -> 1000
    else -> throw RuntimeException("Invalid symbol")
}



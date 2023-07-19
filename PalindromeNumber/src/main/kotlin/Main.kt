// Task https://leetcode.com/problems/palindrome-number/
fun main() {
    println(isPalindrome(121))
}

fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false

    val digits = x.run {
        val digits = mutableListOf<Int>()
        var digit = this
        while (digit != 0) {
            digits.add(digit % 10)
            digit /= 10
        }
        digits
    }

    val reversed = digits.reversed().foldIndexed(0) { index: Int, acc: Int, i: Int ->
        acc + i * Math.pow(10.toDouble(), index.toDouble()).toInt()
    }

    return x == reversed
}
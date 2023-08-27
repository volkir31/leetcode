// Task https://leetcode.com/problems/integer-to-roman/
fun main() {
    println(intToRoman(58))
}

fun intToRoman(num: Int): String {
    var num = num
    var result = ""
    val body: (Int)-> Unit = {
        result += it.integerToRoman()
        num -= it
    }
    when {
        num >= 1000 -> body(1000)
        num >= 900 -> body(900)
        num >= 500 -> body(500)
        num >= 400 -> body(400)
        num >= 100 -> body(100)
        num >= 90 -> body(90)
        num >= 50 -> body(50)
        num >= 40 -> body(40)
        num >= 10 -> body(10)
        num >= 9 -> body(9)
        num >= 5 -> body(5)
        num >= 4 -> body(4)
        else -> body(1)
    }
    if (num > 0) {
        result += intToRoman(num)
    }

    return result
}

fun Int.integerToRoman() = when (this) {
    1 -> "I"
    4 -> "IV"
    5 -> "V"
    9 -> "IX"
    10 -> "X"
    40 -> "XL"
    50 -> "L"
    90 -> "XC"
    100 -> "C"
    400 -> "CD"
    500 -> "D"
    900 -> "CM"
    1000 -> "M"
    else -> ""
}
// Task https://leetcode.com/problems/generate-parentheses/

fun main() {
    println(generateParenthesis(1))
}

fun generateParenthesis(n: Int): List<String> = generate(n, n)

tailrec fun generate(left: Int, right: Int, value: String = "", result: List<String> = listOf()): List<String> =
    when {
        left == 0 && right == 0 -> result + value
        left == right -> generate(left - 1, right, "$value(", result)
        left == 0 -> generate(left, right - 1, "$value)", result)
        else -> generate(left - 1, right, "$value(", result) + generate(left, right - 1, "$value)", result)
    }
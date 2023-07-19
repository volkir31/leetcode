import java.util.*

// Task https://leetcode.com/problems/valid-parentheses/
fun main() {
    println(isValid("()"))//true
    println(isValid("()[]{}"))//true
    println(isValid("(]"))//false
    println(isValid("{[]}"))
    println(isValid("["))
}

fun isValid(s: String): Boolean {
    if (s.isBlank()) return false
    val brackets = mapOf(
        '(' to ')',
        '{' to '}',
        '[' to ']'
    )
    val stack = Stack<Char>()
    s.forEach {
        when {
            !brackets.containsKey(it) -> {
                if (stack.empty()) return false
                if (it != brackets[stack.pop()]) return false
            }

            else -> {
                stack.push(it)
            }
        }
    }
    return stack.empty()
}
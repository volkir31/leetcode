
// Task https://leetcode.com/problems/letter-combinations-of-a-phone-number/
fun main() {
    println(letterCombinations("23"))
    println(letterCombinations(""))
    println(letterCombinations("2"))
}

fun letterCombinations(digits: String): List<String> {
    val variances = mutableListOf<String>()
    val first = digits.firstOrNull() ?: return listOf()
    first.availableLetters.forEach { letter ->
        letterCombinations(digits.drop(1)).ifEmpty { return first.availableLetters }
        letterCombinations(digits.drop(1)).forEach {
            variances.add(letter + it)
        }
    }

    return variances
}

inline val Char.availableLetters get(): List<String> = when(this) {
    '2' -> listOf("a", "b", "c")
    '3' -> listOf("d", "e", "f")
    '4' -> listOf("g", "h", "i")
    '5' -> listOf("j", "k", "l")
    '6' -> listOf("m", "n", "o")
    '7' -> listOf("p", "q", "r", "s")
    '8' -> listOf("t", "u", "v")
    '9' -> listOf("w", "x", "y", "z")
    else -> listOf()
}
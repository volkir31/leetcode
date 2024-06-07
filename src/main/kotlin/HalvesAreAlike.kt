// https://leetcode.com/problems/determine-if-string-halves-are-alike/?envType=daily-question&envId=2024-06-07
fun main() {
    val string = "book"
    val string1 = "textbook"
    val string2 = "Uo"
    println(halvesAreAlike(string))
    println(halvesAreAlike(string1))
    println(halvesAreAlike(string2))
}

fun halvesAreAlike(s: String): Boolean {
    val vowels = setOf("a", "e", "i", "o", "u")
    val firstPart = s.slice(0..<s.length / 2)
    val lastPart = s.slice(s.length / 2 ..<s.length)

    return firstPart.count { it.lowercase() in vowels } == lastPart.count { it.lowercase() in vowels }
}
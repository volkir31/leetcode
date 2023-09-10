// Task https://leetcode.com/problems/length-of-last-word/
fun main() {
    println(lengthOfLastWord("Hello World"))
    println(lengthOfLastWord("   fly me   to   the moon  "))
    println(lengthOfLastWord("luffy is still joyboy"))
}

fun lengthOfLastWord(s: String): Int {
    var lastWordLength = 0
    var currentLength = 0
    val size = s.lastIndex
    s.forEachIndexed { idx, char ->
        if (char.isLetter()) {
            currentLength++
        }
        if ((char.isWhitespace() || idx == size) && currentLength != 0) {
            lastWordLength = currentLength
            currentLength = 0
        }
    }

    return lastWordLength
}
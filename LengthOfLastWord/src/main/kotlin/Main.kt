// Task https://leetcode.com/problems/length-of-last-word/
fun main() {
    println(lengthOfLastWord("Hello World"))
//    println(lengthOfLastWord("   fly me   to   the moon  "))
//    println(lengthOfLastWord("luffy is still joyboy"))
}

fun lengthOfLastWord(s: String): Int {
    var length = 0
    var needCount: Boolean
    s.forEach {
        if (it == ' ') {
            needCount = false
            return@forEach
        } else {
            length = 0
            needCount = true
        }
        if (needCount) {
            length++
        }
    }

    return length
}
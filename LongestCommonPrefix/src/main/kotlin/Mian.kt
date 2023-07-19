// Task https://leetcode.com/problems/longest-common-prefix/
fun main() {
    println(longestCommonPrefix(arrayOf("flower", "flow", "flight")))
    println(longestCommonPrefix(arrayOf("dog","racecar","car")))
}

fun longestCommonPrefix(strs: Array<String>): String {
    var prefix = strs.first()
    strs.drop(1).forEach {
        if (it.length < prefix.length) {
            prefix = prefix.substring(0, it.length)
        }
        val str = it.substring(0, prefix.length)
        prefix.forEachIndexed { index, s ->
            val char = str.getOrNull(index) ?: return@forEach
            if (index > prefix.lastIndex) return@forEach
            if (char != s) {
                prefix = prefix.substring(0, index)
            }
        }
    }

    return prefix
}
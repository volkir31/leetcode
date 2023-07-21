// Task https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
fun main() {
    println(strStr(haystack = "sadbutsad", needle = "sad"))
}

fun strStr(haystack: String, needle: String): Int {
    haystack.windowed(needle.length).forEachIndexed { index, s ->  
        if (s == needle) {
            return index
        }
    }
    
    return -1
}
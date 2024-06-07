// https://leetcode.com/problems/replace-words/description/?envType=daily-question&envId=2024-06-07
fun main() {
    val sentence = "the cattle was rattled by the battery"
    val sentence1 = "aadsfasf absbs bbab cadsfafs"
    val dict = listOf("cat", "bat", "rat")
    val dict1 = listOf("a", "b", "c")
    val dict2 = listOf("catt","cat","bat","rat")
    println(replaceWords(dict, sentence))
    println(replaceWords(dict2, sentence))
    println(replaceWords(dict1, sentence1))
}

fun replaceWords(dictionary: List<String>, sentence: String): String =
    sentence.split(" ").fold(mutableListOf<String>()) { acc, w ->
        var word = w
        dictionary.forEach { dictWord ->
            val length = dictWord.length
            if (word.length < length) return@forEach
            if (word.slice(0 until length) == dictWord) {
                word = dictWord
            }
        }
        acc.also { it.add(word) }
    }.joinToString(separator = " ")
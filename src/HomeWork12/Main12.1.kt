package HomeWork12
/*Задача 1: Группировка анаграмм
Дан список слов. Нужно сгруппировать слова, которые являются анаграммами.
{"listen", "silent", "enlist", "java", "avaj", "world"}*/

fun groupAnagrams(words: List<String>): List<List<String>> {
	val anagramMap = mutableMapOf<String, MutableList<String>>()

	for (word in words) {
		val key = word.lowercase().toCharArray().sorted().joinToString("")
		anagramMap.getOrPut(key) { mutableListOf() }.add(word)
	}
	return anagramMap.values.toList()
}
fun main() {
	val words = listOf("listen", "silent", "enlist", "java", "avaj", "world")
	val grouped = groupAnagrams(words)

	println("Группы анаграмм:")
	for ((index, group) in grouped.withIndex()) {
		println("Группа ${index + 1}: $group")
	}
}

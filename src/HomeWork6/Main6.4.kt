/*Задача 4: Удаление дубликатов с сортировкой:
Напишите функцию, которая удаляет все дубликаты из массива и возвращает отсортированный массив.
Пример:Вход: [4, 2, 2, 8, 5, 6, 8, 5]Выход: [2, 4, 5, 6, 8]*/

fun removeDuplicatesAndSort(arr: Array<Int>): List<Int> {
	return arr.toSet().sorted()
}
fun main() {
	val input = arrayOf(4, 2, 2, 8, 5, 6, 8, 5)
	val result = removeDuplicatesAndSort(input)
	println(result)
}
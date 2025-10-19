package HomeWork12
/*Задача 2: Поиск первого повторяющегося числа
Дан список чисел, нужно найти первое число, которое повторяется*/

fun findFirstDuplicate(nums: List<Int>): Int? {
	val seen = mutableSetOf<Int>()
	for (num in nums) {
		if (!seen.add(num)) {
			return num
		}
	}
	return null
}
fun main() {
	val list1 = listOf(1, 2, 3, 2, 1)
	println("Список 1: ${findFirstDuplicate(list1)}")
}
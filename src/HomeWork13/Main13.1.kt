package HomeWork13
/*Задача 1: Напишите функцию, которая принимает список целых чисел и возвращает их сумму.
Используйте лямбду в качестве параметра для определения операции. (Reduce)*/

fun sumWithOperation(nums: List<Int>, operation: (Int, Int) -> Int): Int {
	return nums.reduce(operation)
}

fun main() {
	val numbers = listOf(1, 2, 3, 4, 5, 53)
	val sum = sumWithOperation(numbers) { acc, num -> acc + num }

	println("Сумма чисел: $sum")
}

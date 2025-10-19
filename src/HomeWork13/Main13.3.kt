package HomeWork13
/*Задача 3: Создайте список чисел от 1 до 1,000,000, отфильтруйте четные числа, затем возведите их в квадрат
и посчитайте сумму всех этих чисел. Сделайте это с использованием asSequence для ленивой обработки.*/

fun main() {
	val numbers = (1..1_000_000).asSequence()

	val sumOfSquares: Long = numbers
		.filter {
			it % 2 == 0
		}
		.map {
			it.toLong() * it
		}
		.sumOf {
			it
		}
	println("Сумма квадратов четных чисел от 1 до 1_000_000: $sumOfSquares")
}
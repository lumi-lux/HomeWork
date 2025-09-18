/*Задание 1: Поиск максимального и минимального элемента массива
Напишите программу, которая находит и выводит максимальное и минимальное значение в массиве целых чисел.
 Также вычислите индекс этих элементов.*/
fun main() {
	println("Введите числа массива через пробел:")

	val input = readLine()
	if (input.isNullOrBlank()) {
		println("Пустой ввод!")
		return
	}
	val arr = input.trim().split("\\s+".toRegex()).map { it.toInt() }
	if (arr.isEmpty()) {
		println("Массив пуст!")
		return
	}
	var maxVal = arr[0]
	var minVal = arr[0]
	var maxIndex = 0
	var minIndex = 0

	for (i in 1 until arr.size) {
		if (arr[i] > maxVal) {
			maxVal = arr[i]
			maxIndex = i
		}
		if (arr[i] < minVal) {
			minVal = arr[i]
			minIndex = i
		}
	}
	println("Максимальное значение: $maxVal (индекс: $maxIndex)")
	println("Минимальное значение: $minVal (индекс: $minIndex)")
}
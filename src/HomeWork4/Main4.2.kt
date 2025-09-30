/*Задание 2: Подсчет четных и нечетных чисел в массиве
Напишите программу, которая принимает массив целых чисел и подсчитывает,
сколько четных и сколько нечетных чисел в нем содержится.*/
fun main() {
	println("Введите числа массива через пробел:")
	val input = readLine()

	if (input.isNullOrBlank()) {
		println("Пустой ввод!")
		return
	}
	val arr = try {
		input.trim().split("\\s+".toRegex()).map { it.toInt() }
	} catch (e: NumberFormatException) {
		println("Ошибка: ввод должен содержать только целые числа.")
		return
	}
	var evenCount = 0
	var oddCount = 0

	for (num in arr) {
		if (num % 2 == 0) {
			evenCount++
		} else {
			oddCount++
		}
	}
	println("Четных чисел: $evenCount")
	println("Нечетных чисел: $oddCount")
}
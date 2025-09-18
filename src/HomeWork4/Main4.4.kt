//Задание 4*: проверка на палиндром.Напишите программу, которая проверяет, является ли массив чисел палиндромом.

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
		println("Ошибка: введите только целые числа, разделённые пробелами.")
		return
	}
	val isPalindrome = arr == arr.reversed()
	if (isPalindrome) {
		println("Массив является палиндромом.")
	} else {
		println("Массив не является палиндромом.")
	}
}
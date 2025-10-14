/*Задание 3: Реверс массива
Напишите программу, которая принимает массив целых чисел и изменяет его порядок на обратный.
Выведите результат после изменения порядка.*/

fun main(){
		println("Введите числа массива через пробел:")
		val input = readLine()

		if (input.isNullOrBlank()) {
			println("Пустой ввод!")
			return
		}
		val arr = try {
			input.trim().split("\\s+".toRegex()).map { it.toInt() }.toIntArray()
		} catch (e: NumberFormatException) {
			println("Ошибка: введите только целые числа, разделённые пробелами.")
			return
		}
		val reversedArr = arr.reversedArray()
		println("Исходный массив: ${arr.contentToString()}")
		println("Реверсированный массив: ${reversedArr.contentToString()}")
	}
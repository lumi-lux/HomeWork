/*Задание 1: Сортировка массива с отрицательными числами:
Отсортируйте массив, чтобы отрицательные числа находились перед положительными,
сохраняя порядок внутри каждой группы.
Пример:Вход: [4, -3, 2, -1, 0, -5]Выход: [-3, -1, -5, 4, 2, 0]*/

fun main() {
	val arr = listOf(4, -3, 2, -1, 0, -5)
	val negatives = arr.filter { it < 0 }
	val nonNegatives = arr.filter { it >= 0 }
	val result = negatives + nonNegatives
	println(result)
}

/*fun main() {
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
	val negatives = arr.filter { it < 0 }
	val nonNegatives = arr.filter { it >= 0 }
	val result = negatives + nonNegatives
	println("Результат: $result")
}*/
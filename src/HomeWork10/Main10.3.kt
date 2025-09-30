package HomeWork10
/*Задача 3: Обработка пустой строки
Задача: Запросить у пользователя строку и проверить, что она не пустая.
Обработать:
IllegalArgumentException, если строка пустая*/

fun main() {
	try {
		print("Введите строку: ")
		val input = readLine()

		if (input.isNullOrBlank()) {
			throw IllegalArgumentException("Строка не может быть пустой.")
		}

		println("Вы ввели: $input")

	} catch (e: IllegalArgumentException) {
		println("Ошибка: ${e.message}")
	} catch (e: Exception) {
		println("Произошла непредвиденная ошибка: ${e.message}")
	}
}
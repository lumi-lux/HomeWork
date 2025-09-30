package HomeWork10
/*Задача 2: Проверка возраста (кастомное исключение)
Задача: Попросить пользователя ввести возраст. Если возраст < 18, выбросить исключение.
Используем кастомное исключение TooYoungException.*/

class TooYoungException(message: String) : Exception(message)

fun main() {
	try {
		print("Введите ваш возраст: ")
		val input = readLine()
		val age = input?.toIntOrNull()

		if (age == null) {
			println("Ошибка: введено не число.")
			return
		}
		if (age < 18) {
			throw TooYoungException("Доступ запрещен: возраст должен быть не менее 18 лет.")
		}
		println("Добро пожаловать! Ваш возраст: $age")

	} catch (e: TooYoungException) {
		println("Исключение: ${e.message}")
	} catch (e: Exception) {
		println("Произошла ошибка: ${e.message}")
	}
}


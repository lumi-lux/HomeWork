package HomeWork10

import java.util.InputMismatchException

/*Задача 1:Деление с обработкой исключения
Задача: Написать программу, которая делит два числа, введенных пользователем.
Обработать:
⦁
ArithmeticException (деление на ноль)
⦁
InputMismatchException (если введено не число)*/
fun main() {
		try {
		print("Введите первое число: ")
		val num1 = readln().toInt()

		print("Введите второе число: ")
		val num2 = readln().toInt()

		val result = num1 / num2
		println("Результат деления: $result")

	} catch (e: InputMismatchException) {
		println("Ошибка: Введено не число.")
	} catch (e: ArithmeticException) {
		println("Ошибка: На ноль делить нельзя")
	}
}

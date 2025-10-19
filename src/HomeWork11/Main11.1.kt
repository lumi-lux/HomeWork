package HomeWork11
/*Задача 1: Последний оставшийся элемент (LinkedList)
В круге из n человек каждый 2-й выбывает, пока не останется один. Используйте LinkedList для моделирования.*/

import java.util.LinkedList

fun lastRemaining(n: Int): Int {
	if (n <= 0) throw IllegalArgumentException("n должно быть положительным")
	if (n == 1) return 1

	val people = LinkedList((1..n).toList())
	var startIndex = 0
	while (people.size > 1) {
		val removeIndex = (startIndex + 1) % people.size
		people.removeAt(removeIndex)
		startIndex = removeIndex % people.size
	}
	return people.first()
}
fun main() {
	println("Для n=5: ${lastRemaining(5)}")
}

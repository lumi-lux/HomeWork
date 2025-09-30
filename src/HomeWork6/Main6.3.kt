/*Задача 3: Сортировка по возрастанию и убыванию:
Реализуйте функцию, которая принимает массив и булевое значение.
Если значение true, сортируйте массив по возрастанию, иначе по убыванию.*/
fun sortArray(arr: Array<Int>, ascending: Boolean) {
	if (ascending) {
		arr.sort()
	} else {
		arr.sortDescending()
	}
}
fun main() {
	val array = arrayOf(3, 1, 4, 1, 5, 9, 2, 6)

	sortArray(array, true)
	println(array.joinToString())

	val array2 = arrayOf(3, 1, 4, 1, 5, 9, 2, 6)
	sortArray(array2, false)
	println(array2.joinToString())
}
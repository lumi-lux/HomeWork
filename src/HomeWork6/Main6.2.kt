/*Задание 2: Частотная сортировка:
Напишите функцию, которая сортирует массив по частоте появления элементов (по убыванию).Если два элемента встречаются
одинаковое количество раз, сортируйте их по возрастанию.Пример:Вход: [4, 5, 6, 5, 4, 3]Выход: [4, 4, 5, 5, 6, 3]*/
//Решение не моё!

fun main() {
	fun frequencySort(arr: IntArray): IntArray {
	// Шаг 1: Подсчитываем частоты
	val frequency = mutableMapOf<Int, Int>()
	var maxFreq = 0
	for (num in arr) {
		val count = frequency.getOrDefault(num, 0) + 1
		frequency[num] = count
		if (count > maxFreq) maxFreq = count
	}

	// Шаг 2: Создаём корзины (список списков) по частотам
	val buckets = Array<MutableList<Int>>(maxFreq + 1) { mutableListOf() }
	for ((num, freq) in frequency) {
		buckets[freq].add(num)
	}

	// Шаг 3: Собираем результат — от высокой частоты к низкой
	val result = mutableListOf<Int>()
	for (freq in maxFreq downTo 1) {  // От max частоты к 1
		val bucket = buckets[freq]
		bucket.sort()  // Сортируем элементы внутри корзины по возрастанию
		for (num in bucket) {
			repeat(freq) {  // Добавляем элемент столько раз, сколько его частота
				result.add(num)
			}
		}
	}

	return result.toIntArray()
}


	val arr = intArrayOf(4, 5, 6, 5, 4, 3)
	val sortedArr = frequencySort(arr)
	println("Результат: ${sortedArr.contentToString()}")
	// Вывод: [4, 4, 5, 5, 3, 6]
}

package HomeWork14
/*Задача 1: Синхронизация доступа к счетчику с помощью внешнего объекта
Вам нужно создать класс Counter, который будет иметь метод increment и метод decrement.
Эти методы должны увеличивать и уменьшать значение переменной count в многопоточном режиме.
Для синхронизации доступов используйте внешний объект (не объект класса).*/

class Counter {
	private var count: Int = 0
	private val lock = Any()

	fun increment() {
		synchronized(lock) {
			count++
		}
	}
	fun decrement() {
		synchronized(lock) {
			count--
		}
	}
	fun getCount(): Int {
		synchronized(lock) {
			return count
		}
	}
}
fun main() {
	val counter = Counter()
	val threads = mutableListOf<Thread>()
	for (i in 1..10) {
		val thread = Thread {
			for (j in 1..1000) {
				counter.increment()
				counter.decrement()
			}
		}
		threads.add(thread)
		thread.start()
	}
	threads.forEach { it.join() }
	println("Финальное значение count: ${counter.getCount()}")
}

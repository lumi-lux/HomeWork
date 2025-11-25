package HomeWork143
/*Задача 3: Синхронизация потоков для предотвращения гонки данных
Напишите программу с двумя потоками, которые одновременно увеличивают и уменьшают значение счетчика.
Ваша задача — обеспечить, чтобы операция увеличения и уменьшения была выполнена безопасно с помощью синхронизации.*/
class JustCounter {
	private var count: Int = 0

	@Synchronized
	fun increment() {
		count++
	}
	@Synchronized
	fun decrement() {
		count--
	}
	fun getCount(): Int {
		return count
	}
}
fun main() {
	val counter = JustCounter()
	val threads = mutableListOf<Thread>()

	val incrementThread = Thread {
		for (i in 1..1000) {
			counter.increment()
		}
	}
	threads.add(incrementThread)

	val decrementThread = Thread {
		for (i in 1..1000) {
			counter.decrement()
		}
	}
	threads.add(decrementThread)
	threads.forEach { it.start() }
	threads.forEach { it.join() }

	println("Финальное значение count: ${counter.getCount()}")
}

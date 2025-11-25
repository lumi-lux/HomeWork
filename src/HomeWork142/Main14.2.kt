package HomeWork142
/*Задача 2: Применение атомарных типов для безопасного увеличения счетчика
Напишите программу, в которой два потока одновременно увеличивают счетчик.
Вместо синхронизации используйте класс AtomicInteger, чтобы избежать блокировок.*/
import java.util.concurrent.atomic.AtomicInteger

class AnotherCounter {
	private val count = AtomicInteger(0)

	fun increment() {
		count.incrementAndGet()
	}
	fun getCount(): Int {
		return count.get()
	}
}
fun main() {
	val counter = AnotherCounter()
	val threads = mutableListOf<Thread>()

	for (i in 1..2) {
		val thread = Thread {
			for (j in 1..1000) {
				counter.increment()
			}
		}
		threads.add(thread)
		thread.start()
	}
	threads.forEach { it.join() }

	println("Финальное значение count: ${counter.getCount()}")
}



package HomeWork13
/*Задача 2: Напишите программу, которая получает список людей, фильтрует только тех, кто старше 18 лет,
затем сортирует их по возрасту в порядке убывания и выводит на экран с помощью apply и let. (sortedByDescending)*/

data class Person(val name: String, val age: Int)

fun main() {
	val people = listOf(
		Person("Sasha", 25),
		Person("Diana", 17),
		Person("Dima", 30),
		Person("Natasha", 15),
		Person("Oksana", 22)
	)
	people
		.filter {
			it.age > 18
		}
		.sortedByDescending {
			it.age
		}
		.apply {
			forEach {
				println("Name: ${it.name}, Age: ${it.age}")
			}
		}
		.let { sortedList ->
			println("Всего отфильтрованных и отсортированных: ${sortedList.size}")
		}
}

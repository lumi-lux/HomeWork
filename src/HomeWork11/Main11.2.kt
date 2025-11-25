package HomeWork11
/*Задача 2: Слияние двух отсортированных LinkedList в один (без Set, Map)
Даны два отсортированных LinkedList, нужно слить их в один отсортированный список.*/
import java.util.LinkedList

fun mergeSortedLists(list1: LinkedList<Int>, list2: LinkedList<Int>): LinkedList<Int> {
	val result = LinkedList<Int>()

	val it1 = list1.iterator()
	val it2 = list2.iterator()

	var val1: Int? = if (it1.hasNext()) it1.next() else null
	var val2: Int? = if (it2.hasNext()) it2.next() else null

	while (val1 != null && val2 != null) {
		if (val1 <= val2) {
			result.add(val1)
			val1 = if (it1.hasNext()) it1.next() else null
		} else {
			result.add(val2)
			val2 = if (it2.hasNext()) it2.next() else null
		}
	}
	while (val1 != null) {
		result.add(val1)
		val1 = if (it1.hasNext()) it1.next() else null
	}
	while (val2 != null) {
		result.add(val2)
		val2 = if (it2.hasNext()) it2.next() else null
	}
	return result
}
fun main() {
	val list1 = LinkedList(listOf(1, 3, 5, 7))
	val list2 = LinkedList(listOf(2, 4, 6, 8))

	val merged = mergeSortedLists(list1, list2)
	println("Слитый список: $merged")
}

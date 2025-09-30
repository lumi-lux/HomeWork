package HomeWork7

fun main() {
	val book1 = Book(1236,"Alice through the Looking Glass", "Lewis Carroll", "1871", Genre.FANTASY)
	val book2 = Book(12598,"The Sign of the Four", "Arthur Conan Doyle", "1890", Genre.DETECTIVE)
	val book3 = Book(3245,"On the Origin of Species", "Charles Darwin", "1859", Genre.SCIENCE)
	val book4 = Book(1454,"The Diary of a Young Girl", "Anne Frank", "1947", Genre.HISTORY)

	println(book1)
	println(book2)
	println(book3)
	println(book4)

	println()

	println(book2.equals(book4))

	println()

	println(book1 == book3)
	println(book1 == book2)
	println(book1 == book4)
	println(book1 === book4)
	println(book1 === book3)
	println(book1 === book2)
	println(book1 === book1)
	println(book1 == book1)

	println()

	println(book2.hashCode())
	println(book4.hashCode())
	println(book2.hashCode() == book4.hashCode())

	}
package HomeWork7

var reader: String? = null

class Book(
	override var id: Int,
	val title: String,
	val author: String,
	val year: String,
	val Genre: Genre,
	) : LibraryItem(id), Borrowable {

	override fun toString(): String {
		return "Book(id=$id, title=$title, author=$author, year=$year, genre=${Genre})"
	}

	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (other !is Book) return false
		return title == other.title &&
				author == other.author &&
				year == other.year &&
				id == other.id
	}

	fun hashCode(book4: Book): Int {
		var result = title.hashCode()
		result = (31 * result) + author.hashCode()
		result = (31 * result) + year.hashCode()
		result = (31 * result) + id
		return result
	}

	override fun borrow(user: String) {
		if (reader == null) {
			reader = user
			println("The book was handed over to : $reader")
		} else {
			println("The book is already was handed over to : $reader")
		}
	}
}

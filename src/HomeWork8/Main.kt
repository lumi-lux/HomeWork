package HomeWork8

fun main() {
	val products = listOf(
		Electronics("smartfon", 25000.00),
		Clothing("jacket", 5000.0),
		Food("bread", 100.0)
	)
	products.forEach {
		product ->
		println("${product.getFinalPrice()}")
	}
}

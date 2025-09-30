package HomeWork8

class Food (
	val name: String,
	val price: Double,
	) : Product {
	override fun getFinalPrice(): Double = price
}
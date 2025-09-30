package HomeWork8

class Clothing (
	val name: String,
	val price: Double
	) : Product {
	override fun getFinalPrice(): Double = price * 0.85
}
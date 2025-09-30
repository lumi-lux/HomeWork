package HomeWork8

class Electronics (
	val name: String,
	val price: Double,
	) : Product {
	override fun getFinalPrice(): Double = price * 0.9
}

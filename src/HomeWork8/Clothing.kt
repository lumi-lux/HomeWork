package HomeWork8

data class Clothing (
	override val name: String,
	override val price: Double
	) : Product {
	override fun getFinalPrice(): Double = price * 0.85
	override fun getName(): String = name
}
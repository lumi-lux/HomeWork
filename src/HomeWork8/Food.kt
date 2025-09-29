package HomeWork8

data class Food (
	override val name: String,
	override val price: Double,
	) : Product {
	override fun getFinalPrice(): Double = price
	override fun getName(): String = name
}
package HomeWork8

data class Electronics (
	override val name: String,
	override val price: Double,
	) : Product {
	override fun getFinalPrice(): Double = price * 0.9
	override fun getName(): String = name
}

//HomeWork2.1
//Напишите программу, которая вычисляет периметр и площадь прямоугольника. Длина и ширина прямоугольника вводятся с клавиатуры.
fun main() {
    println("enter num1")
    val num1: Int = readlnOrNull()?. toInt() ?: 0
    println("enter num2")
    val num2: Int = readlnOrNull()?. toInt() ?: 0
    val perimetr = ((num1 + num2)*2)
    println(perimetr)
    val square = (num1 * num2)
    println(square)
}
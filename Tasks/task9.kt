import kotlin.math.sqrt

class Vector(val x: Double, val y: Double, val z: Double) {

    fun length(): Double = sqrt(sqr(x) + sqr(y) + sqr(z))

    fun dot(other: Vector): Double =
        x * other.x + y * other.y + z * other.z

    infix fun dotInfix(other: Vector): Double =
        x * other.x + y * other.y + z * other.z

    operator fun times(other: Vector): Double =
        x * other.x + y * other.y + z * other.z

    override fun toString(): String = "Vector($x, $y, $z)"
}

fun dotProduct(v1: Vector, v2: Vector): Double =
    v1.x * v2.x + v1.y * v2.y + v1.z * v2.z

fun main() {
    println("=== Задание 9 ===")
    val v1 = Vector(1.0, 2.0, 3.0)
    val v2 = Vector(3.0, 2.0, 1.0)
    println("Вектор v1: $v1")
    println("Вектор v2: $v2")

    println("Длина v1: ${v1.length()}")
    println("Скалярное произведение (метод): ${v1.dot(v2)}")
    println("Скалярное произведение (infix): ${v1 dotInfix v2}")
    println("Скалярное произведение (оператор *): ${v1 * v2}")
    println("Скалярное произведение (внешняя функция): ${dotProduct(v1, v2)}")
}
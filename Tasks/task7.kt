import kotlin.math.sqrt

fun sqr(n: Double): Double = n * n

fun discriminant(a: Double, b: Double, c: Double): Double =
    sqr(b) - 4 * a * c

fun rootsNumber(a: Double, b: Double, c: Double): Int {
    val d = discriminant(a, b, c)
    return when {
        d > 0 -> 2
        d == 0.0 -> 1
        else -> 0
    }
}

fun quadraticRoot(a: Double, b: Double, c: Double) {
    val d = discriminant(a, b, c)
    when (rootsNumber(a, b, c)) {
        2 -> {
            val x1 = (-b + sqrt(d)) / (2 * a)
            val x2 = (-b - sqrt(d)) / (2 * a)
            println("Два корня: x1 = $x1, x2 = $x2")
        }
        1 -> {
            val x = -b / (2 * a)
            println("Один корень: x = $x")
        }
        else -> println("Корней нет (D < 0)")
    }
}

fun main() {
    println("=== Задание 7 ===")
    println("Уравнение 1x^2 - 3x + 2 = 0")
    quadraticRoot(1.0, -3.0, 2.0)
    println("Уравнение 1x^2 - 2x + 1 = 0")
    quadraticRoot(1.0, -2.0, 1.0)
    println("Уравнение 1x^2 + x + 1 = 0")
    quadraticRoot(1.0, 1.0, 1.0)
}
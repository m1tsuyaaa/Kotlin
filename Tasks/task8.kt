class ArrayProcessor(private val arr: Array<Int>) {

    fun sumPositive(): Int {
        var sum = 0
        for (x in arr) {
            if (x > 0) sum += x
        }
        return sum
    }

    fun product(): Int {
        var p = 1
        for (x in arr) {
            p *= x
        }
        return p
    }

    fun average(): Double {
        if (arr.isEmpty()) return 0.0
        return arr.sum().toDouble() / arr.size
    }
}

fun main() {
    println("=== Задание 8 ===")
    val processor = ArrayProcessor(arrayOf<Int>(1, -2, 3, -4, 5))
    println("Массив: 1, -2, 3, -4, 5")
    println("Сумма положительных элементов: ${processor.sumPositive()}")
    println("Произведение элементов: ${processor.product()}")
    println("Среднее арифметическое: ${processor.average()}")
}
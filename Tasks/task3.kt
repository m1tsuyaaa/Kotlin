fun main() {
    println("=== Задание 3 ===")
    val a = (0..10).random()
    println("Программа загадала число от 0 до 10. Попробуйте угадать!")
    while (true) {
        print("Введите ваш вариант: ")
        val b = readln().toInt()
        if (b > a) {
            println("Много")
        } else if (b < a) {
            println("Мало")
        } else {
            println("Угадал")
            break
        }
    }
}
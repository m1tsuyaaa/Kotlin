fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    var i = 2
    while (i * i <= n) {
        if (n % i == 0) return false
        i++
    }
    return true
}

fun main() {
    println("=== Задание 4 ===")
    print("Введите количество простых чисел n: ")
    val n = readln().toInt()
    var count = 0
    var number = 2
    while (count < n) {
        if (isPrime(number)) {
            count++
            println("$count-ое число: $number")
        }
        number++
    }
}
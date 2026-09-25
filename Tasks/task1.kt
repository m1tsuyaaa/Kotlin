fun main() {
    println("=== Task 1 ===")
    print("Enter a positive integer: ")
    val input = readln()

    val firstChar = input.first()
    val lastChar = input.last()
    val sumStr = firstChar.digitToInt() + lastChar.digitToInt()
    println("Using first() and last(): sum = $sumStr")

    val number = input.toInt()
    val lastDigit = number % 10
    var temp = number
    while (temp >= 10) {
        temp /= 10
    }
    val firstDigit = temp
    println("Using % and /: sum = ${firstDigit + lastDigit}")
}
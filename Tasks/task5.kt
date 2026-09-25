fun main() {
    println("=== Задание 5 ===")
    val arr = arrayOf(3, 5, 2, 8, 1, 9, 4, 7, 6, 0)
    println("Массив: ${arr.joinToString()}")

    print("Через for: ")
    for (i in 1..<arr.size - 1) {
        if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
            print("${arr[i]} ")
        }
    }
    println()

    print("Через while: ")
    var i = 1
    while (i < arr.size - 1) {
        if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
            print("${arr[i]} ")
        }
        i++
    }
    println()

    print("Через forEach: ")
    arr.forEachIndexed { index, value ->
        if (index > 0 && index < arr.size - 1) {
            if (value > arr[index - 1] && value > arr[index + 1]) {
                print("$value ")
            }
        }
    }
    println()
}
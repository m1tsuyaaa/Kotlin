fun main() {
    println("=== Задание 6 ===")
    val arr: Array<Int> = arrayOf<Int>(2, 4, 6, 8, 10)
    println("Массив: ${arr.joinToString()}")
    
    var productFor = 1
    for (x in arr) productFor *= x
    println("Произведение (for): $productFor")
    
    var productWhile = 1
    var i = 0
    while (i < arr.size) {
        productWhile *= arr[i]
        i++
    }
    println("Произведение (while): $productWhile")
    
    var productForEach = 1
    arr.forEach { productForEach *= it }
    println("Произведение (forEach): $productForEach")

    // Способ 4: функция reduce()
    val productReduce = arr.reduce { acc, x -> acc * x }
    println("Произведение (reduce): $productReduce")

    // Способ 5: функции min() и max()
    println("min = ${arr.min()}, max = ${arr.max()}")
}
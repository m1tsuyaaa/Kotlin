fun main() {
    println("=== Task 2 ===")
    var count = 0
    var sum = 0.0
    println("Enter numbers (0 to stop):")
    while (true) {
        val num = readln().toInt()
        if (num == 0) break
        count++
        sum += num
    }
    val average = if (count > 0) sum / count else 0.0
    println("Count: $count")
    println("Sum: $sum")
    println("Average: $average")
}
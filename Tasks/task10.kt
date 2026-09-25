open class Vehicle(
    open var speed: Double = 0.0,
    open var name: String = "Транспортное средство"
) {
    open fun start() {
        println("$name начал движение со скоростью $speed км/ч")
    }

    open fun stop() {
        println("$name остановился")
    }
}

class Boat(speed: Double = 30.0) : Vehicle(speed, "Лодка") {
    override fun start() {
        println("$name начала движение со скоростью $speed км/ч")
    }
    override fun stop() {
        println("$name бросила якорь")
    }
}

class Plane(speed: Double = 900.0) : Vehicle(speed, "Самолёт") {
    override fun start() {
        println("$name начал движение со скоростью $speed км/ч")
    }
    override fun stop() {
        println("$name совершил посадку")
    }
}

class Tank(speed: Double = 50.0) : Vehicle(speed, "Танк") {
    override fun start() {
        println("$name начал движение со скоростью $speed км/ч")
    }
    override fun stop() {
        println("$name остановился")
    }
}

fun main() {
    println("=== Задание 10 ===")
    val vehicles = listOf(Boat(), Plane(), Tank())
    for (v in vehicles) {
        v.start()
        v.stop()
        println()
    }
}
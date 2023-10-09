// Клас Тварина
open class Animal(
    private val name: String,
    private val age: Int,
) {
    open fun move() {}

    fun eat() {
        println("Я їм!")
    }
}

// Клас Собака
class Dog(
    name: String,
    age: Int,
) : Animal(name, age) {
    override fun move() {
        println("Я бігаю!")
    }

    fun bark() {
        println("Гав!")
    }
}

// Клас Птиця
class Bird(
    name: String,
    age: Int,
) : Animal(name, age) {
    override fun move() {
        println("Я літаю!")
    }

    fun sing() {
        println("Щирі-щирі, я пташка!")
    }
}

// Інтерфейс ПодатиГолос
interface ICanMakeSound {
    fun voiceLoud()
    fun voiceQuiet()
}

// Клас Риба
class Fish(
    name: String,
    age: Int,
) : Animal(name, age) {
    override fun move() {
        println("Я плаваю!")
    }
}

// Приклад використання
fun main() {
    // Створити об'єкти класів Собака, Птиця та Риба
    val dog = Dog("Дружок", 10)
    val bird = Bird("Соловейко", 5)
    val fish = Fish("Карась", 2)

    // Вивести інформацію про об'єкти
    println("Собака:")
    println("Ім'я: ${dog.name}")
    dog.move()
    dog.bark()

    println("Птах:")
    println("Ім'я: ${bird.name}")
    bird.move()
    bird.sing()

    println("Риба:")
    println("Ім'я: ${fish.name}")
    fish.move()
}

// Оголошення data class Figure
data class Figure(val width: Double, val height: Double) {
    // Приватне поле area
    private var area: Double = 0.0

    // Геттер для area
    fun getArea(): Double {
        return area
    }

    // Приватний сеттер для area (встановлення через метод)
    private fun setArea() {
        area = width * height
    }
}

// Оголошення enum для типів фігур
enum class FigureType {
    RECTANGLE,
    TRIANGLE,
    CIRCLE
}

// Оголошення sealed class FigureDescription
sealed class FigureDescription(val type: FigureType)

// Похідні класи для опису різних типів фігур
data class RectangleDescription(val width: Double, val height: Double) : FigureDescription(FigureType.RECTANGLE)
data class TriangleDescription(val base: Double, val height: Double) : FigureDescription(FigureType.TRIANGLE)
data class CircleDescription(val radius: Double) : FigureDescription(FigureType.CIRCLE)

fun main() {
    // Список фігур
    val figures = listOf(
        Figure(5.0, 4.0),
        Figure(3.0, 7.0),
        Figure(6.0, 6.0)
    )

    // Цикл для обчислення загальної площі
    var totalArea = 0.0
    for (figure in figures) {
        figure.setArea() // Встановлюємо площу для кожної фігури
        totalArea += figure.getArea() // Додаємо площу до загальної суми
    }

    println("Загальна площа всіх фігур: $totalArea")
}
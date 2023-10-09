sealed class Shape

data class Rectangle(val width: Double, val height: Double) : Shape()
data class Oval(val majorAxis: Double, val minorAxis: Double) : Shape()
data class Line(val length: Double) : Shape()

fun main() {
    // Список фігур
    val shapes = listOf(
        Rectangle(5.0, 4.0),
        Oval(3.0, 7.0),
        Line(6.0),
        Rectangle(7.0, 3.0),
        Oval(6.0, 6.0),
        Line(8.0)
    )

    // Варіант 1: Фільтрація списку
    val rectanglesCount = shapes.filterIsInstance<Rectangle>().count()
    val ovalsCount = shapes.filterIsInstance<Oval>().count()
    val linesCount = shapes.filterIsInstance<Line>().count()

    println("За допомогою фільтрації списку:")
    println("Кількість Rectangle: $rectanglesCount")
    println("Кількість Oval: $ovalsCount")
    println("Кількість Line: $linesCount")

    // Варіант 2: Використання when в циклі списку
    var rectangles = 0
    var ovals = 0
    var lines = 0

    for (shape in shapes) {
        when (shape) {
            is Rectangle -> rectangles++
            is Oval -> ovals++
            is Line -> lines++
        }
    }

    println("\nЗа допомогою when в циклі списку:")
    println("Кількість Rectangle: $rectangles")
    println("Кількість Oval: $ovals")
    println("Кількість Line: $lines")
}
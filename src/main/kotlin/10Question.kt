import java.util.Scanner
import kotlin.math.sqrt

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter square coefficient")
    val squareCoefficient: Double = scanner.nextDouble()
    println("Enter x coefficient")
    val xCoefficient: Double = scanner.nextDouble()
    println("Enter free coefficient")
    val freeCoefficient: Double = scanner.nextDouble()

    findAllRoots(squareCoefficient, xCoefficient, freeCoefficient)
}


fun findAllRoots(squareCoefficient: Double, xCoefficient: Double, freeCoefficient: Double) {
    val discriminant = xCoefficient * xCoefficient - 4 * squareCoefficient * freeCoefficient
    if (discriminant > 0) {
        val root1 = (-xCoefficient + sqrt(discriminant)) / 2 * squareCoefficient
        val root2 = (-xCoefficient - sqrt(discriminant)) / 2 * squareCoefficient
        println("First root is: $root1")
        println("Second root is: $root2")
    } else if (discriminant == 0.0) {
        val root = (-xCoefficient + sqrt(discriminant)) / 2 * squareCoefficient
        println("First root is: $root")
        println("Second root is: $root")
    } else {
        val realPart = -xCoefficient / (2 * squareCoefficient)
        val imaginaryPart = sqrt(-discriminant) / (2 * squareCoefficient)
        println("Two complex roots:")
        println("Root 1: $realPart + ${imaginaryPart}i")
        println("Root 2: $realPart - ${imaginaryPart}i")
    }
}

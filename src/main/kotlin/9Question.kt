import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter year")
    val year = scanner.nextInt()
    checkLeapYear(year)
}

fun checkLeapYear(year: Int) {
    if((year%4==0 && year%100!=0) || (year%400 == 0)){
        println("Leap year")
    }else{
        println("Not leap year")
    }
}
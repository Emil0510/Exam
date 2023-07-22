import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    println("Enter number")
    val number = scanner.nextInt()
    checkSumOfPrimeNumber(number)

}
fun checkSumOfPrimeNumber(number : Int){
    for(i in 2 .. number/2){
        var countFirst = 0
        var countSecond = 0
        for (j in 1 .. i){
            if(i%j==0){
                countFirst++
            }
        }
        for (k in 1 .. number-i){
            if((number-i)%k==0){
                countSecond++
            }
        }

        if(countFirst==2 && countSecond==2){
            println("$number = $i + ${number-i}")
        }
    }
}
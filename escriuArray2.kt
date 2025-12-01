import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val tamanyArray = scanner.nextInt()
    scanner.nextLine()
    var array = Array<String>(tamanyArray){scanner.nextLine()}
    var accedir = scanner.nextInt()
    for (frases in array){
        println(frases)
    }
    println(array[accedir])

}
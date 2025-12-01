import java.util.Scanner

fun main() {
    val scanner= Scanner(System.`in`)
    val repetir = scanner.nextInt()

        repeat(repetir){
            var pisos =scanner.nextInt()
            var suma = 0
            for (i in 1..pisos){
                suma += i*i
            }
            println(suma)

        }
    }

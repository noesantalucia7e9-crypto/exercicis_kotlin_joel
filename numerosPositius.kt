import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val repeticions = scanner.nextInt()
    repeat(repeticions){
        var suma: Int =0
        var producte: Int = 1
    val numero = scanner.nextInt()
    if (numero<=0){println("ELS NOMBRES NATURALS COMENCEN EN 1")}
    else{
        for (i in 1..numero){
            suma+=i
            producte*=i

        }
        println("SUMA: $suma PRODUCTE: $producte")
    }

    }

}
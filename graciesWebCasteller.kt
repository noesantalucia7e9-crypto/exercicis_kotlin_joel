import java.util.Scanner
import kotlin.math.max
import kotlin.math.min

fun main() {
    val scanner = Scanner(System.`in`)
    val casosProva = scanner.nextInt() //introduir quantitat de vegades
    scanner.nextLine()
    repeat(casosProva) {
        //inputs paraula 1 i la "generada per la app"
        val paraula1 = scanner.nextLine()
        val paraula2 = scanner.nextLine()
        //comptador per a quan les lletres siguin les mateixes sumar1
        var contador = 0
        //encontrar valors max i minims dels string(numero lletres)

        val longmin = min(paraula1.length, paraula2.length)
        val longmax = max(paraula1.length, paraula2.length)
        //per a "i" tots els numeros de lletra until el minim de longitud, si un valor de la paraula1 es igual a un valor de la paraula2
        //sumar a comptador1

        for (i in 0 until longmin) {
            if (paraula1[i] == paraula2[i]) {
                contador++
            }
        }
        //calcul escollir resposta

        val minrequerida = (longmax + 1) / 2

        if (contador >= minrequerida) {
            println("GRACIES WEBCASTELLER")
        }
        else{
            println("WEBCASTELLER ESTA TRAVIESO HOY")
        }


    }
}
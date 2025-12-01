import java.util.Scanner
import kotlin.math.ceil

fun main() {
    val scanner = Scanner(System.`in`)
    val casosarepetir = scanner.nextInt() //quantes vegades s'ha de repetir
    repeat(casosarepetir) {
        var any = scanner.nextInt().toDouble() //any introduit en que es celebra la festivitat
        var generacion = (ceil(any/2)-1).toInt() //calcul de la generació en la que està l'any de 0 a infinit (va de dos en dos)

        print("Caga ")//el caga del verb cagar correcte no el "caga" que no toca
        repeat(generacion){ //segons la generació repetira imprimir el "caga" incorrecte per la generacio
            print("caga")
        }
        print("tio!") //imprimir el nombre real del tronc al final.
    }
}
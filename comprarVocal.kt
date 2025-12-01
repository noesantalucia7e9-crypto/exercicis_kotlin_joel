import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    val casosProva = scanner.nextInt()
    scanner.nextLine()
        repeat(casosProva) {
            //llegir linea
            val paraula = scanner.nextLine()
            //pasar a minuscules la paraula per a ser mes facil analitzar
            val paraulaAMinuscules = paraula.lowercase()

            //variables comptador vocals
             var a = 0
            var e = 0
            var i = 0
            var o = 0
            var u = 0
            //si cualsevol caracter de la paraula es igual a una de les vocals sumar 1
            for (x in paraulaAMinuscules) {
                when (x) {
                    'a' -> a++
                    'e' -> e++
                    'i' -> i++
                    'o' -> o++
                    'u' -> u++
                }
            }
            //resultats
            print("A: $a")
            print(" E: $e")
            print(" I: $i")
            print(" O: $o")
            print(" U: $u")


        }
    }

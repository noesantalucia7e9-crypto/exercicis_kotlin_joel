import java.util.Scanner
import kotlin.math.abs

fun main() {
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt()
    scanner.nextLine()

    repeat(casos) {
        // llegeix el tamany de la llista
        val k = scanner.nextLine().toInt()

        // llegeix les talles de sabates i les converteix a Int
        val lineaSabetes = scanner.nextLine()
        val mides = lineaSabetes
            .trim() // Elimina espais al principi i al final
            .split(" ")
            .filter { it.isNotEmpty() } // Filtra espais dobles o línies buides
            .map { it.toInt() }

        // llegeix M (la teva mida) i G (el marge acceptable)
        val midaMargeLine = scanner.nextLine().split(" ")
        val lamevamida = midaMargeLine[0].toInt()
        val margeAcceptable = midaMargeLine[1].toInt()

        var contador = 0

        // Iterem sobre els elements de l'array
        for (midaSabata in mides) {
            // Condició: La diferència absoluta entre la sabata i la meva mida
            val diferencia = abs(midaSabata - lamevamida)

            if (diferencia <= margeAcceptable) {
                contador++
            }
        }

        // imprimeix el resultat
        println(contador)
    }
}
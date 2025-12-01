import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    if (!scanner.hasNextInt()) return

    val F = scanner.nextInt()
    val C = scanner.nextInt()

    // 1. Lectura de la matriu actual (List of Lists)
    val actual = List(F) {
        scanner.next().map { it.toString().toInt() }
    }

    // 2. Càlcul de la següent generació
    val seguent = List(F) { f ->
        List(C) { c ->

            // Comptar veïns usant les 8 posicions de desplaçament
            val veïnsVius = (-1..1).sumOf { i ->
                (-1..1).sumOf { j ->
                    // Evitem la cel·la actual
                    if (i == 0 && j == 0) 0
                    else actual.getOrNull(f + i)?.getOrNull(c + j) ?: 0
                }
            }

            val viva = actual[f][c] == 1

            // Aplicació de les regles
            if (viva) {
                if (veïnsVius == 2 || veïnsVius == 3) 1 else 0 // Segueix viva
            } else {
                if (veïnsVius == 3) 1 else 0 // Neix
            }
        }
    }

    // 3. Sortida
    seguent.forEach { println(it.joinToString("")) }
}
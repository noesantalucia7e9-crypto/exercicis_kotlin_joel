import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Línia 1: Nombre de casos de prova
    val casos = scanner.nextInt()

    repeat(casos) {
        // 1. Lectura de les dimensions i el nombre de fantasmes (k)
        val files = scanner.nextInt() // Alçada (Y màxima)
        val columnes = scanner.nextInt() // Amplada (X màxima)
        val numeroFantasmes = scanner.nextInt() // K

        // 2. Lectura de les posicions dels fantasmes
        // La matriu tindrà [x, y] per cada fantasma.
        val matriuFantasmes = mutableListOf<MutableList<Int>>()
        for (fantasmes in 0 until numeroFantasmes) {
            val filaFantasma = MutableList(2) { scanner.nextInt() }
            matriuFantasmes.add(filaFantasma)
        }


        // matriuFantasmes[0][0] es la coordenada X del blau.
        // matriuFantasmes[0][1] eºs la coordenada Y del blau.
        val xBlau = matriuFantasmes[0][0]
        val yBlau = matriuFantasmes[0][1]

        // Guardem les posicions com a String "x,y" (o parells/objectes) per facilitar la comprovació.
        val posicionsBloquejades = mutableSetOf<String>()

        // Afegim les posicions de TOTS els fantasmes (inclòs el blau, ja que bloqueja el seu propi espai)
        for (fantasma in matriuFantasmes) {
            posicionsBloquejades.add("${fantasma[0]},${fantasma[1]}")
        }

        // 4. Comprovem les 4 direccions

        // Moviments possibles: [dx, dy]
        val moviments = listOf(
            Pair(0, 1),   // Amunt: Y+1
            Pair(0, -1),  // Avall: Y-1
            Pair(1, 0),   // Dreta: X+1
            Pair(-1, 0)   // Esquerra: X-1
        )

        var esPotMoure = false

        // Iterem per cada direcció
        for ((dx, dy) in moviments) {
            val novaX = xBlau + dx
            val novaY = yBlau + dy


            val dinsLimits = novaX >= 1 && novaX < columnes - 1 &&
                    novaY >= 1 && novaY < files - 1

            if (dinsLimits) {
                val posicioAdjacent = "$novaX,$novaY"


                // Només cal comprovar que la nova casella NO estigui al Set de fantasmes
                if (posicioAdjacent !in posicionsBloquejades) {
                    esPotMoure = true
                }
            }
            // Si és paret o si la casella està ocupada, 'esPotMoure' continua sent false.
        }

        // 5. Impressió del resultat
        if (esPotMoure) {
            println("THIS IS FINE")
        } else {
            println("OH NO")
        }
    }
}
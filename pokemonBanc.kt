import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    // Lectura de A (casos) i B (mida del banc)
    val casos = scanner.nextInt()
    val midaBanc = scanner.nextInt()
    scanner.nextLine()

    repeat(casos) {
        // lectura de les dues llistes (Pokèdex i Nivell)

        // llegeix la línia de la Pokèdex i la converteix a una llista d'Ints
        val pokedexLine = scanner.nextLine().trim().split(" ")
        val pokedexList = pokedexLine.mapNotNull { it.toIntOrNull() }

        // llegeix la línia dels Nivells i la converteix a una llista d'Ints
        val nivellLine = scanner.nextLine().trim().split(" ")
        val nivellList = nivellLine.mapNotNull { it.toIntOrNull() }

        // trobar el Nivell Màxim per a cada Pokèdex (Tipus)

        // Utilitzem un Map: Clau = Num. Pokèdex, Valor = Nivell Màxim Trobant
        val maxNivells = mutableMapOf<Int, Int>()

        // iterem sobre les dues llistes simultàniament
        for (i in pokedexList.indices) {
            val numPokedex = pokedexList[i]
            val nivellActual = nivellList[i]

            // comprovar si el nivell actual és més alt que el màxim trobat
            // (Si no existeix a maxNivells, maxOf() utilitza el nivell actual com a nou màxim)
            val nivellMaxActual = maxNivells.getOrDefault(numPokedex, 0)

            if (nivellActual > nivellMaxActual) {
                maxNivells[numPokedex] = nivellActual
            }
        }

        // 3. Generar la Sortida: Recórrer l'entrada original i filtrar els que es queden

        val resultat = StringBuilder()

        // les instàncies de nivell més baixes (que apareixen abans) no s'han d'afegir.
        val tipusAfegits = mutableSetOf<Int>()

        // Iterem sobre l'entrada original de Pokèdex i Nivell
        for (i in pokedexList.indices) {
            val numPokedex = pokedexList[i]
            val nivellActual = nivellList[i]

            // REGLA: Si aquest Pokèmon té el NIVEL MÀXIM per al seu tipus (guardat al Map)
            // I aquest tipus de Pokèmon encara no s'ha afegit a la sortida.
            if (nivellActual == maxNivells[numPokedex] && numPokedex !in tipusAfegits) {
                // afegir al resultat i marcar el tipus com a afegit.
                resultat.append(numPokedex).append(" ")
                tipusAfegits.add(numPokedex)
            }
        }
        //imprimir resultat final
        println(resultat.toString())
    }
}

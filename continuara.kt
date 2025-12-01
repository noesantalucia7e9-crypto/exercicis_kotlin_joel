import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt()
    scanner.nextLine()

    repeat(casos) {
        val linea = scanner.nextLine().split(" ")

        // utilitzem un StringBuilder per construir la sortida amb els espais correctament
        val resultat = StringBuilder()

        // iterem fins a la penúltima paraula per poder comparar amb la següent
        for (i in 0 until linea.size - 1) {
            val paraulaActual = linea[i]
            val paraulaSeguent = linea[i + 1]

            if (paraulaActual.length < paraulaSeguent.length) {
                // afegim punts suspensius
                resultat.append(paraulaActual).append("...")
            } else {
                resultat.append(paraulaActual)
            }

            // afegim l'espai de separació de paraules.
            resultat.append(" ")
        }

        // afegir l'última paraula (sense espai darrere)
        if (linea.isNotEmpty()) {
            resultat.append(linea.last())
        }

        // corregim la sortida: Utilitzem println() per separar cada cas de prova
        println(resultat.toString())
    }
}
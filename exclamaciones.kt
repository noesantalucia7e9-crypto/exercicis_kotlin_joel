import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var continuarLlegint = true


   //mentre que continuarllegint siqui true i hi hagi una entrada d'scanner
    while (continuarLlegint && scanner.hasNextLine()) {

        val linea = scanner.nextLine()

        // si es detecta "fin" es cambia a false el valor de continuarllegint
        // Esto garantiza que el bucle no se ejecutará de nuevo.
        if (linea == "FIN") {
            continuarLlegint = false
        }
        else {
            // comptar el numero de caracters d' apertura (¡)
            val numApertura = linea.count { it == '¡' }

            // comptar el numero de caracters de tancament (!)
            val numCierre = linea.count { it == '!' }

            //si hi ha caracters d'aèrtura i tancament "si" en cas contrari "no"
            if (numApertura > 0 && numCierre > 0) {
                println("SI")
            } else {
                println("NO")
            }
        }
    }

}
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)


        // lectura de les dimensions de la matriu i l'objectiu 't'
        val numFiles = scanner.nextInt()
        val numColumnes = scanner.nextInt()
        val t = scanner.nextInt()

        // generació i lectura de la matriu
        val matriu = mutableListOf<MutableList<Int>>()
        for (f in 0 until numFiles) {
            val fila = MutableList(numColumnes) { scanner.nextInt() }
            matriu.add(fila)
        }

        // cerca de l'element amb 't' a la dreta i a l'esquerra

        // el resultat per defecte és "NO"
        var resultat = "NO"

        // només busquem si la matriu té almenys 3 columnes
        if (numColumnes >= 3) {

            // recorregut de la matriu
            for (fila in 0 until numFiles) {
                // Iterem només per als elements centrals (índex 'columna' de 1 a numColumnes - 2)
                for (columna in 1 until numColumnes - 1) {

                    val elementActual = matriu[fila][columna]
                    val elementEsquerra = matriu[fila][columna - 1]
                    val elementDreta = matriu[fila][columna + 1]

                    // comprovació de la condició
                    if (elementEsquerra == t && elementDreta == t) {

                        // si encara no hem trobat cap resultat, guardem aquest
                        // això assegura que el valor retornat sigui el PRIMER trobat
                        if (resultat == "NO") {
                            resultat = elementActual.toString()
                        }
                    }
                }
            }
        }

        // imprimim el resultat
        println(resultat)

}
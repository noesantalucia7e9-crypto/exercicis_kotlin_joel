import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // introduïm la mida de la matriu original (f x c)
    val numFiles = scanner.nextInt()
    val numColumnes = scanner.nextInt()

    // generem la matriu original (f files x c columnes)
    val matriuOriginal = mutableListOf<MutableList<Int>>()
    for (fila in 1..numFiles) {
        // Legim una fila sencera (c elements) i l'afegim a la matriu
        matriuOriginal.add(MutableList(numColumnes) { scanner.nextInt() })
    }

    //creem dos noves variables per a la matriu transposada (sino me lio vale? se q no es necesario)
    val numFilesT = numColumnes
    val numColumnesT = numFiles

    //creem la matriu transposada buida
    val matriuTransposada = MutableList(numFilesT) { MutableList(numColumnesT) { 0 } }
    //iterem per anar asignant els valors
    for (files in 0 until numFilesT) {
        for (columnes in 0 until numColumnesT) {
            matriuTransposada[files][columnes] = matriuOriginal[columnes][files]
        }
    }

    // imprimim la matriu transposada
    for (fila in matriuTransposada){
        println(fila.joinToString(" "))
    }

}
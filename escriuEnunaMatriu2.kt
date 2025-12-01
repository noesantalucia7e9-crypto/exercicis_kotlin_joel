import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
//llegim numero de files i columnes a inserir a la matriu
    val files = scanner.nextInt()
    val columnes = scanner.nextInt()
//creem la taula i inserim els valors
    var taula = mutableListOf<MutableList<Int>>()
    for (fila in 1 .. files) {
        taula.add(MutableList(columnes) {scanner.nextInt()}.toMutableList())
    }
    val i = scanner.nextInt()
    val j = scanner.nextInt()


    //canviem els valors
    for (fila in taula) {
        for ( columna in fila){
            if ( taula[i][j] == i ){
                taula[i][j] = j

            }
        }


    }
    //imprimim la matriu sencera
    for (fila in taula) {
        println(fila.joinToString(" "))

    }

}
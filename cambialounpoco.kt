import java.util.Locale
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`).useLocale(Locale.UK)
    // inserir quantitat de casos
    val repeticions = scanner.nextInt()
    repeat(repeticions) {
        //valor tamany array
        val tamanyarray = scanner.nextInt()
        //validar array i llegir els valors a inserir amb decimals
        var array = IntArray(tamanyarray) { scanner.nextInt() }
        //inserir valors p1 i p2
        var p1 = scanner.nextInt()
        var p2 = scanner.nextInt()
        //si algun valor del array es igual a p1, canviar per p2
        for (x in array.indices) {
            if (array[x] == p1) {
                array[x] = p2
            }
            //imprimir resultat
            print("${array[x]} ")
        }

    }

}
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    //llegir casos a tractar
    val casos = scanner.nextInt()
    scanner.nextLine()
    repeat(casos) {
// inserir la frase a la qual canviar les lletres
        var linea = scanner.nextLine()
//canviar les lletres
        linea = linea
            .replace("v", "@")
            .replace("b", "v")
            .replace("@", "b")
            .replace("V", "@")
            .replace("B", "V")
            .replace("@", "B")


//imprimir resultat
        println(linea)


    }
}
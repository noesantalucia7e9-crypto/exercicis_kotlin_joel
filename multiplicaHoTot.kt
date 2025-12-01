import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    //casos de prova a considerar
    val casosProva = scanner.nextInt()
    repeat(casosProva) {
        //numero valors array
        var numeroK = scanner.nextInt()
        //valors a introduir al array
        var arrayValors = Array(numeroK) { scanner.nextInt() }
        //numero que multiplicara tots els valors del array
        var numeroMultiplicar = scanner.nextInt()
//imprimir valors del array multiplicats per tres
        for (i in arrayValors.indices) {
            print("${arrayValors[i] * numeroMultiplicar} ")

        }
    }


}
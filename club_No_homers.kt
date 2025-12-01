import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    //indiquem els casos de proba a treballar
    val casosProva = scanner.nextInt()
    scanner.nextLine()
    repeat(casosProva) {
        //fem una llista dels noms
        val llistanoms = scanner.nextLine().split(" ").toMutableList()
        //inserim el "nomvetat" es un nom que nomes pot apareixer una vegada al final
        val nomvetat = scanner.nextLine()
        // creem una nova llista que sera on anirem afegint els noms a imprimir al final
        var llista2 = mutableListOf<String>()
        //comptador per a tenir en compte la quantitat de vegades que ha sortit el nom vetat a la llists
        var nomvetatcomptador = 0
        //segons el criteri establert, afegirem els noms a la llista
        for (paraules in llistanoms.indices) {
            if (llistanoms[paraules] == nomvetat) {
                if (nomvetatcomptador == 0) {
                    llista2.add(nomvetat)
                    nomvetatcomptador++
                }
            } else {
                llista2.add(llistanoms[paraules])
            }
        }
//imprimim el resultat final
        println(llista2)


    }
}
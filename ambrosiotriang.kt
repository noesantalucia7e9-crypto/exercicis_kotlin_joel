import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val numCasos = scanner.nextInt()

    for (i in 1..numCasos) {
        // Llegeix el nombre de pisos (P) per al cas actual
        if (!scanner.hasNextInt()) {
            break // Atura si no hi ha més nombres per llegir
        }
        val pisos = scanner.nextInt()

        // El nombre de pisos (P) ha de ser almenys 1 per tenir una piràmide.
        if (pisos <= 0) {
            println(0) // 0 Ferreros si no hi ha pisos
            continue
        }

        // --- Càlcul del Total de Ferreros (Nombre Tetraèdric) ---

        // Utilitzem 'Long' per assegurar-nos que el resultat càpiga, ja que el nombre de pisos
        // pot ser gran i el resultat creix ràpidament.
        val P = pisos.toLong()

        // FÓRMULA: Te_P = P * (P + 1) * (P + 2) / 6
        // Calculem el numerador: P * (P + 1) * (P + 2)
        val numerador = P * (P + 1) * (P + 2)

        // Dividim per 6 per obtenir el total de Ferreros
        // Com que P, P+1, P+2 sempre conté múltiples de 2 i 3, la divisió sempre és exacta.
        val totalFerreros = numerador / 6

        // Imprimeix el resultat per al cas de prova actual
        println(totalFerreros)
    }

}
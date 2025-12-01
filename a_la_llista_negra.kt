import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    //casos a considerar
    val casos = scanner.nextInt()
    scanner.nextLine()

    // Jocs Acceptats (No donen nivell de Shitlist)
    val jocsAcceptats = setOf("HollowKnight", "DarkSouls", "Zelda")
    val jocPenalitzacioDoble = "LoL"
    val jocPermes = "Eclipse"

    repeat(casos) {
        //llegim els jocs i creem una llista
        val llistaJocs = scanner.nextLine().trim().split(" ")
        //inserim el numero de vegades que s'hi fixa el profesor
        val vegadesEsFixa = scanner.nextInt()

        // Llista d'hores en les que s'hi fixa
        val llistaHores = MutableList(vegadesEsFixa){scanner.nextInt()}
        scanner.nextLine()

        var nivellShitlist = 0 // Inicialment 0

        // iterem les hores de vigilància
        for (hora in llistaHores) {
            // l'hora de 15 a 20 correspon a l'índex 0 a 5: INDEX = HORA - 15
            val indexActivitat = hora - 15

            // comprovem si l'índex és vàlid (de 0 a 5)
            if (indexActivitat in 0 until 6) {
                val jocJugat = llistaJocs[indexActivitat]

                // aplicar les regles

                // Si no està fent Eclipse, el Marc jutja.
                if (jocJugat != jocPermes) {

                    // Si el joc NO és un dels acceptats
                    if (jocJugat !in jocsAcceptats) {
                        nivellShitlist += 1 // SUMA 1 nivell (per un joc qualsevol no permès)
                    }

                    // Si és LoL, s'atorga una penalització ADDICIONAL (ja que LoL no és acceptat)
                    if (jocJugat == jocPenalitzacioDoble) {
                        nivellShitlist += 1 // SUMA 1 nivell addicional (Total de 2 punts per LoL)
                    }
                }
            }
        }

        // imprimim el resultat final
        println("Nivell de Shitlist: $nivellShitlist")
    }
}
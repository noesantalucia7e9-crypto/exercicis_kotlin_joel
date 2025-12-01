import java.util.Scanner
import kotlin.io.print
import java.text.Normalizer

fun main() {
    val scanner = Scanner(System.`in`)
    //inserir casos a tractar
    val casos = scanner.nextInt()
    scanner.nextLine()
    repeat(casos) {
        //creem una variable resposta per a la primera part de la resposta
        var respuesta = ""
        //llegim la linea amb els noms i fem split despres de cada coma i espai
        var lineanoms = scanner.nextLine().split(", ")
        //iterem a la linea amb els noms i agafem la primer lletra de cada nom
        for (i in lineanoms.indices){
            respuesta += lineanoms[i].first()
        }
        //creem una variable per a diferenciar la paraula de despres de la i i l'imprimim, aixi formant la resposta sencera
//        var lineanoms2 = lineanoms.last().split("i ")
//           print(lineanoms2[1].first())
        var lineanoms2 = lineanoms.last().split("i ")
        respuesta+= lineanoms2[lineanoms2.size-1].first()
        println(Normalizer.normalize(respuesta, Normalizer.Form.NFD).replace("\\p{InCombiningDiacriticalMarks}+".toRegex(), ""))
        println()

    }
}


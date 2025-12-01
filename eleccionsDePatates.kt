import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    //inserim casos a tractar
    val casosprova = scanner.nextInt()
    repeat(casosprova) {
        //input de quantitat dels candidats per a saber el tamany de l'array
        var opcions = scanner.nextInt()
        //array amb vots dels candidats
        var array = Array(opcions) { scanner.nextInt() }
        //comptador del candidat amb més vots 1,2,3...
        var candidatGuanyador = 0
        //valor de vots més gran
        var valorMesGran = 0

//iterem entre els diferents candidats
        for (i in 0 until array.size) {
            //quant veiem que hi ha un valor mes gran al array que el que hi havia anteriorment en el comptador, posem el seu valor al comptador
            if (array[i] > valorMesGran) {
                //guardem el candidat guanyador
                candidatGuanyador = i
                //guardem el valor mes gran, per a comparar en la seguent vegada que s'executi el bucle
                valorMesGran = array[i]
            }
            //imprimim el resultat
        }
        println(candidatGuanyador + 1)

    }
}
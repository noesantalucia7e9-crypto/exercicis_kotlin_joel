import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    //casos a tractar
    val casosProva =scanner.nextInt()
    repeat(casosProva){
        //inserir tamany del array
        val tamanyArray = scanner.nextInt()
        //array amb els numeros
        val valorsNumeros = Array(tamanyArray){scanner.nextInt()}
        //numero que s'ha de vigilar cuantes vegades apareix
        val p = scanner.nextInt()
        //contador per al numero de vegades que apareix
        var contadorp = 0
        //si el numero apareix al array +1 al comptador
        for (i in valorsNumeros.indices) {
            if (valorsNumeros[i] == p){contadorp++}
        }
        //imprimir numero de vegades que apareix el numero
        println(contadorp)
    }
}
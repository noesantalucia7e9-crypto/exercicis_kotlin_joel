import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    //casos de prova a considerar
    val casosProva = scanner.nextInt()
    repeat(casosProva){
        //inserir tamany del array
        var tamanyArray = scanner.nextInt()
        //array amb els valors que es poden repetir
        var arrayBloodborneLike = Array(tamanyArray){scanner.nextInt()}
        //contador de valors que s'han repetit
        var contador=0
        //iterem entre els valors del array 0 fins al penultim
        for (i in 0 until tamanyArray -1){
            //si un valor del array es igual al seguent, sumem 1 al contador
            if(arrayBloodborneLike[i] == arrayBloodborneLike[i+1]){contador++}
        }
        //imprimim resposta segons el contador
        if (contador == 0){println("NO")}
        else{println("SI")}

    }

}
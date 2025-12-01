import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    //introduim tamany de la matriu
    val tamanymatriu = scanner.nextInt()
// generem la matriu
    var matriu = mutableListOf<MutableList<String>>()
    for (fila in 1 .. tamanymatriu){
        matriu.add(MutableList(tamanymatriu){"."})
    }
//iterem en cada fila i columna per a canviar els valors
    for (fila in 0 until tamanymatriu){
        for (columnes in 0 until tamanymatriu){
            if (fila == columnes || fila+columnes==tamanymatriu-1){
                matriu[fila][columnes] = "X"
            }
            if (matriu[fila]==matriu[0]){matriu[fila][columnes] = "X"}
            if (matriu[fila]== matriu[tamanymatriu-1]){matriu[fila][columnes] = "X"}
            if (columnes==tamanymatriu-1){matriu[fila][columnes] = "X"}
        }

    }
//imprimim el resultat final
    for (fila in matriu){
        println(fila.joinToString (" "))
    }


}
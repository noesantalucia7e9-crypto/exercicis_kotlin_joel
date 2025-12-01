import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    //introduim tamany de la matriu identitat
    val tamanymatriu = scanner.nextInt()
// generem la matriu identitat
    var matriu = mutableListOf<MutableList<Int>>()
    for (fila in 1 .. tamanymatriu){
        matriu.add(MutableList(tamanymatriu){0})
    }
//iterem en cada fila i columna per a canviar els valors
    for (fila in 0 until tamanymatriu){
        matriu[fila][fila] = 1
    }
//imprimim el resultat final
    for (fila in matriu){
        println(fila.joinToString (" "))
    }


}
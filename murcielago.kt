import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    //variable per a guardar la paraula a introduir
    val paraula: String = scanner.nextLine()
    //si les lletres a,e,i,o,u estan a l'string imprimir "TOTES", en cas contrari imprimir "FALTEN"
    if (paraula.contains('a')&&paraula.contains('e')&&paraula.contains('i')&&paraula.contains('o')&&paraula.contains('u')){
        println("TOTES")
    }
    else{println("FALTEN")}
}
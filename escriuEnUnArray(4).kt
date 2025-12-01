import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    //valor tamany array
    val tamanyarray = scanner.nextInt()
    //validar array i llegir els valors a inserir
    var array = IntArray(tamanyarray) {scanner.nextInt()}
    //llegir el valor que s'ha de sumar a cada resultat de l'array
    var sumar = scanner.nextInt()
//imprimir valors del array sumant el valor
    for(x in array){
        print("${x+sumar} ")
    }


}

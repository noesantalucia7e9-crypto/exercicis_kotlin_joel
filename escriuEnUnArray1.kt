import java.util.Scanner

fun main (){
    val scanner = Scanner(System.`in`)
    //definir tamany del array
    val tamany : Int = scanner.nextInt()
    //validar array i insertar valors
    var llista = Array<Int>(tamany) {scanner.nextInt()}
    //escollir posicio del array que es vol imprimir
    var posArray = scanner.nextInt()
// imprimir els valors del array sencer
    for (x in llista.indices) {
        print("${llista[x]} ")
    }
    println()
    //imprimir valor del array en la posicio escollida
    println(llista[posArray])

}








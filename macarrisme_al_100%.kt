import java.util.Locale
import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`).useLocale(Locale.UK)
    //valor tamany array
    val tamanyarray = scanner.nextInt()
    //validar array i llegir els valors a inserir amb decimals
    var array = DoubleArray(tamanyarray) {scanner.nextDouble()}
//imprimir valors del array amb els percentatges
    for(x in array){
        print("${x*100}% ")
    }

}
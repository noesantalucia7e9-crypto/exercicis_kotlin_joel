import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    //inserir casos a considerar
    val casos = scanner.nextInt()
    scanner.nextLine()
    repeat(casos){
        //inserir la paraula a tractar
        val paraula = scanner.nextLine().lowercase()
        //si la paraula inserida es patata, imprimir es patata, en cas contrari no es patata
        if (paraula == "patata"){println("Es patata")}
        else{println("No es Patata")}
    }
}
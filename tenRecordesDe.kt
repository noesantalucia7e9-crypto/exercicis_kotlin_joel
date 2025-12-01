import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    //input dels casos de prova a considerar
    var casosDeProva = scanner.nextInt()
    repeat(casosDeProva) {
        //nombre tamany array
        var nombre1 = scanner.nextInt()
        //array dels numeros a inserir
        var linia3 = Array(nombre1){scanner.nextInt()}
        //numero de posicio la qual es vol imprimir del array
        var nombrep = scanner.nextInt()
//resultat
      for (i in linia3.indices) {
          print("${i*3} ")
      }

    }


}
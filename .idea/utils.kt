import java.util.Scanner


fun demanarMissatge(scanner: Scanner, missatge: String):String{
    println("INSEREIX MISSATGE")
    val missatge = scanner.nextLine()

    return missatge

}

fun abrirScanner (){
    val scanner = Scanner(System.`in`)
}

fun demanarint(scanner: Scanner): Int {
    var tieneint = false
    var numero = 0
    println("INTRODUEIX UN VALOR NUMERIC")
    while (!tieneint) {
        if (scanner.hasNextInt()) {
            numero = scanner.nextInt()
            tieneint = true
        } else {
            print("INTRODUEIX UN VALOR NUMERIC")
            scanner.next()
        }
    }
    return numero
}

fun esperfecte (numero : Int) : Boolean{
    var siono = false
    var resultat = 0

    for(i in 1 until numero){
        if (numero %i == 0){
            resultat += i
        }
    }
    if (resultat == numero){
        siono = true
    }
    return siono
}
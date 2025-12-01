import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var nom: String = scanner.nextLine()
    var validar: Boolean = false
    for (x in nom) {
        if (nom[0] != x) {
            validar = true
        }
    }
    if(validar){println("SI")}
    else {println("NO")}
}






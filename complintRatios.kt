import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val casosProva = scanner.nextInt()
    repeat(casosProva) {
        val tamanyLlista = scanner.nextInt()
        var llista = MutableList(tamanyLlista) {scanner.next().split(" ")}

        val alumneP = scanner.nextInt()

        llista.removeAt(alumneP)
        for (tios in llista) {
            print(tios.joinToString(" "))
            print(" ")
        }


    }
}
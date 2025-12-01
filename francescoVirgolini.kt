import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val casos = scanner.nextInt()
    scanner.nextLine()

    repeat(casos) {
        val numeroCotxes = scanner.nextInt()
        scanner.nextLine()

        // utilitzem nextLine() per capturar noms amb espais
        val llistaCotxes = MutableList(numeroCotxes) { scanner.nextLine() }

        val francesco = "Francesco Virgolini"
        val posicioFrancesco = llistaCotxes.indexOf(francesco)


        if (posicioFrancesco > 0) {
            val posicioendevant = posicioFrancesco - 1

            // intercanviem la posicio de francesco
            val cotxeDavant = llistaCotxes[posicioendevant]
            llistaCotxes[posicioendevant] = francesco
            llistaCotxes[posicioFrancesco] = cotxeDavant
        }
        //imprimir
        println(llistaCotxes.joinToString(prefix = "[", separator = ", ", postfix = "]"))
    }
}
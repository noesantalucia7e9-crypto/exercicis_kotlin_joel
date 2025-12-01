import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    //inserir casos a tractar
    var casos = scanner.nextInt()
    repeat(casos) {
        //inserir tamany del array
        val tamanyArray = scanner.nextInt()
        //variables per a definir els valors mes grans o mes petits inserits al array
        var tamanyMesGran = 1
        var tamanyMespetit = 1
        //array amb valors
        val alumnesAlçades = Array(tamanyArray){scanner.nextInt()}
//iterem entre els valors, el primer valor sempre sera el mes petit aixi que li donem el valor de mes petit, per la resta, si el valor es mes gran que el guardat en el comptador, es canvia per aqquest nou
        for (i in alumnesAlçades.indices) {
            tamanyMespetit = alumnesAlçades[0]
            if (alumnesAlçades[i] > tamanyMesGran) {tamanyMesGran = alumnesAlçades[i]}
        }
        //imprimim el resultar de la resta per a veure la diferencia
        println(tamanyMesGran-tamanyMespetit)
    }
}
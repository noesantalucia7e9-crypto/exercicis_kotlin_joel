import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    //prenem vegades que repetirem l'acció
    val casos = scanner.nextInt()
    scanner.nextLine()

    repeat(casos) {
        //linea on introduirem l'estring lalafel, aranya o telaranya acompanyats d'una coma i espai
        val linea = scanner.nextLine()
        //linea on introduirem la capacitar de les teranyines
        val capacidadN = scanner.nextInt()
        //en aquesta variable la string que hem introduit abans amb lalafel, teranyines, aranya es dividira en paraules, utilitzant com a referencia la coma
        scanner.nextLine()

        var palabras = linea.lowercase().split(", ")
        //variables per a comptar els lalafels que es balançejen, les teranyines que estàn disponibles i demotrar les que estan plenes
        var lalafelsBalanceando = 0
        var telaranyasDisponibles = 0
        var telaranyasLlenas = 0
// per a cada paraula en l'estring quan la paraula sigui, lalafel, telaranya, es sumarà al comptador de cadacú 1 respectivament, l'aranya posarà tot a 0
        for(palabra in palabras) {
            when(palabra) {
                "lalafel" -> lalafelsBalanceando++
                "telaranya" -> telaranyasDisponibles++
                "aranya" -> {
                    telaranyasLlenas=0
                    telaranyasDisponibles=0
                    lalafelsBalanceando=0
                }
            }
        }
        //mentres que les teranyines disponibles siguin majors a 0 , els lalafels balancejant siguin majors o iguals a la capaçitat de les teranyines o la capacitat de les teranyines sigui superior a 0
        while (telaranyasDisponibles > 0 && lalafelsBalanceando >= capacidadN && capacidadN > 0) {
            telaranyasLlenas++
            lalafelsBalanceando -= capacidadN
            telaranyasDisponibles--
        }
        //mostrar el resultat
        println("Hay $telaranyasLlenas telaranyas llenas.")

    }
}
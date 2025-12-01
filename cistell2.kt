import java.util.Locale
import java.util.Scanner
//creem la clase producte per a ficar les variables que seran la info
data class Producte (
    val nom : String,
    val preu : Float
)

fun main(){
    val scanner = Scanner(System.`in`).useLocale(Locale.UK)

    val quantitatProductes = scanner.nextInt() //inserir numero de productes a tractar
    scanner.nextLine()
    var llistaProductes = mutableListOf<Producte>() //creem llista on ficarem els productes

    //anirem afegint els productes a la llista i anirem guardant el producte mes car i mes barat
    repeat(quantitatProductes) {
        var producte = Producte(scanner.next(), scanner.nextFloat())
    }

    llistaProductes.sortBy { it.nom }

    val producteEsvolNom = scanner.next() //inserim el numero del producte que volem

    for (i in llistaProductes.indices){
        if(llistaProductes[i].nom.equals(producteEsvolNom)&& llistaProductes[1].nom.equals(producteEsvolNom)){
            println("SI, M'HA COSTAT ${llistaProductes[1].preu}")
        }
        else if(llistaProductes[i].nom.equals(producteEsvolNom)){
            println("SI, M'HA COSTAT ${llistaProductes[i].preu} I TAMBE TINC ${llistaProductes[i+1].nom} A ${llistaProductes[i+1].preu}")
        }
        else{println("NO N'HI HAVIA\n")}
    }


    //imprimim els resultats

}
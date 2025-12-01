//import java.util.Locale
//import java.util.Scanner
////creem la clase producte per a ficar les variables que seran la info
//data class Producte (
//    val nom : String,
//    val preu : Float
//)
//
//fun main(){
//    val scanner = Scanner(System.`in`).useLocale(Locale.UK)
//
//    val quantitatProductes = scanner.nextInt() //inserir numero de productes a tractar
//    var producteMesCarNom = "" //variable on guardarem el nom del producte mes car
//    var producteMesCarPreu : Float = 0F // variable on guardarem el preu del producte mes car
//    var producteMesBaratNom = "" //variable on guardsrem el nom del producte mes barat
//    var producteMesBaratPreu: Float = 232F // variable on guardarem el preu del producte mes barat
//scanner.nextLine()
//    var llistaProductes = mutableListOf<Producte>() //creem llista on ficarem els productes
//
//    //anirem afegint els productes a la llista i anirem guardant el producte mes car i mes barat
//    repeat(quantitatProductes) {
//        var producte = Producte(scanner.next(), scanner.nextFloat())
//        if (producte.preu>producteMesCarPreu){
//            producteMesCarNom = producte.nom
//            producteMesCarPreu = producte.preu
//        }
//        if (producte.preu<producteMesBaratPreu){
//            producteMesBaratNom = producte.nom
//            producteMesBaratPreu = producte.preu
//        }
//        llistaProductes.add(producte)
//    }
//    val producteEsvolNumero = scanner.nextInt() //inserim el numero del producte que volem
//    llistaProductes.sortByDescending { it.preu }
//
//    //imprimim els resultats
//    println("EL MES CAR: $producteMesCarNom $producteMesCarPreu")
//    println("EL MES BARAT: $producteMesBaratNom $producteMesBaratPreu")
//    println("EL BUSCAT: ${llistaProductes[producteEsvolNumero-1].nom} ${llistaProductes[producteEsvolNumero-1].preu}")
//}
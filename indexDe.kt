import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    //introduir casos a tractar
    val casosProva = scanner.nextInt()
    repeat(casosProva){
        //introduir tamany del array
        var tamanyArray = scanner.nextInt()
        //array amb valors dels folis
        var nombresFoli =  Array(tamanyArray){scanner.nextInt()}
        //posicio on es desitja el foli
        var posicioFoli = scanner.nextInt()
        //comptador on esta el foli, si no hi ha = -1
        var onestaelfoli = -1
//iterem desde 0 a la quantitat de valors -1 per a que no ens doni un "autofbounds"
        for (i in 0 until nombresFoli.size-1){
            //si hi han un o mes folis repetits la posicio del foli sera la inicial "0"
            if (nombresFoli[i] == nombresFoli[i+1]){onestaelfoli=0}
            //en cas contrari si hi ha nomes un foli daquell que es vol, onestaelfoli pasara a ser la posicio d'aquest
            else if (nombresFoli[i] == posicioFoli){onestaelfoli = i}
        }
        //imprimim el resultat
       println(onestaelfoli)
    }
}
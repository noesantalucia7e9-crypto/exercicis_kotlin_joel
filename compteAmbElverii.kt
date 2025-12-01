import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    //creem variable per a inserir la quantitat de casos de prova
    val casosProva =scanner.nextInt()
    //repetir les vegades inserides a "casosProva"
    repeat(casosProva){
        //creem variables per a guardar la vida inicial del monstre el valor d'atac de Rammus i el valor d'atac de Twitch
        var vidaMaxMonstre = scanner.nextInt()
        var atkRammus = scanner.nextInt()
        var atkVeriTwitch = scanner.nextInt()
        //creem la variable ultimcop per a guardar quin dels dos (rammus o twitch) farà l'ultim cop, el que mata al monstre
        var ultimCop = 0
        //guardem la quantitat de rondes que s'ha atacat
        var numeroAtacs = 0
//        //mentres que la vida del monstre sigui major a 0: sumarem una ronda d'atacs i atacarà rammus, en el cas que la
//        la vida del monstre sigui menor o igual a zero li donarem valor 1 a ultimcop, indicant que rammus ha matat al monstre
//        en cas contrari seguirem atacant amb twitch , si aquest ataca i mata el monstre ultim cop +1 indicant que aquest l'ha matat
        while (vidaMaxMonstre>0){

            numeroAtacs++
            vidaMaxMonstre-=atkRammus
            if (vidaMaxMonstre<=0){ultimCop++}
            if (ultimCop==0){
                vidaMaxMonstre-=atkVeriTwitch
                if (vidaMaxMonstre<=0){ultimCop++}
                if (ultimCop==1){println("TWITCH $numeroAtacs")}
            }
            else {println("RAMMUS $numeroAtacs")}

        }

    }
}
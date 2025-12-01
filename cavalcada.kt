import java.util.*


//Per cada cas de prova cal indicar el nombre màxim de fileres de gent que veuren la cavalcada sense que ningú els tapi la vista.

fun main() {
    val scanner = Scanner(System.`in`)

// inserim el tamany del array
    var quantitatPersones = scanner.nextInt()
//mentres que la quantitat de persones no sigui zero farem el següent:
    while(quantitatPersones!=0){
//guardem les alçades de totes les persones
        val personesAltures=Array(quantitatPersones){scanner.nextInt()}

        //Les files a la dreta són les que estan a davant així que recorrem la llista d'alçades
        //desde la última posició fins la primera guardant-nos l'alçada màxima per saber si les files del darrere podràn veure o no
        //(la fila més alta de les que te una altra fila al davant és la que determina si veu o no)

        var maxAlt = Int.MIN_VALUE//Variable que determinarà l'alçada màxima de les files que hi ha al davant
        var filesVista=0//Contador de les files que poden veure la cavalcada

        for(i in personesAltures.size-1 downTo 0){//Iterem els index de final a principi
            if(personesAltures[i]>maxAlt){//Si la fila és més alta que totes lés files que té al davant:
                filesVista++//El nombre de files que veuen augmenta
                maxAlt = personesAltures[i]//L'alçada màxima s'actualitza
            }
        }

        println(filesVista)//imprimim el resultat final

        quantitatPersones=scanner.nextInt()//Llegim l'input del següent cas de prova
    }
}
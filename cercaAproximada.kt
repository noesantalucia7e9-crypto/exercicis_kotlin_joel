import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    //introduir casos
    val casos = scanner.nextInt()
    repeat(casos){
        //introduir tamany array
        var tamanyarray = scanner.nextInt()
        // array + valors del array
        var midesSabates = Array<Int>(tamanyarray){scanner.nextInt()}
        //mida sabates usuari
        var laMevaMida = scanner.nextInt()
        //variable contador per a comptar els casos correctes
        var contador = 0
        for (i in 0 until midesSabates.size){
            //si al array hi ha un valor igual o superior o menor per 1, contador +1
            if (midesSabates[i]==laMevaMida){contador++}
            if (midesSabates[i] == laMevaMida+1){contador++}
            else if (midesSabates[i] == laMevaMida-1){contador++}

        }
        // si hi ha 1 o més d 1 cas probable imprimir, si en cas contrari no
        if (contador != 0){println("SI")}
        else{println("NO")}
    }
}
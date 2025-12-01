import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    //guardar quantitat de proves que farem
    var casosProva = scanner.nextInt()

    repeat(casosProva) {
        //guardar la profunditat del pou, els metres que puja durant el dia, els metres que baixa durant la nit
        var profunditat = scanner.nextInt()
        var metresDiaMes = scanner.nextInt()
        var metresNitMenys = scanner.nextInt()
        //comptar els dies que triga
        var dies = 0
        //si els metres que baixa per la nit son superiors o iguals als que puja durant el dia i la profunditat es major als metres que puja durant el dia, el cargol no podrà sortir, per tant imprimim "NO"
        if (metresNitMenys >= metresDiaMes && profunditat > metresDiaMes) {
            println("NO")
        }
        else {
            //mentre que la profunditat que ens queda (metres) sigui superior a zero, executar el seguent:
            while (profunditat>0) {
                //sumem un dia
                dies++
                //restem els metres de profunditat segons el que puja durant el dia el cargol
                profunditat -= metresDiaMes
                //si la profunditat es menor o igual a zero significarà que ha sortit del pou, per tant no arribarà la nit, en cas contrari arribara la nit i caurà x metres
                if (profunditat<=0){println(dies)}
                else {
                    profunditat += metresNitMenys
                }

            }
        }
    }
}
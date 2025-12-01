import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    var casosprova =scanner.nextInt()
    var ojopiojo = 0
    repeat(casosprova){

        val dies = scanner.nextInt()
        repeat(dies){
            var barri = scanner.nextInt()
            if (barri>=300){ojopiojo = ojopiojo+1}
        }
        if (ojopiojo>0){println("ALARMA")}
        if (ojopiojo==0){println("OK")}
        var ojopiojo =0
    }
}
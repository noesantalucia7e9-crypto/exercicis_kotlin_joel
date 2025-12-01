import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var casosprova = scanner.nextInt()


    repeat(casosprova) {
        var h: Boolean = false
        var b: Boolean = false
        var m: Boolean = false
        repeat(5) {
            var numero= scanner.nextInt()
            if (numero>=10000){m=true}
            else if (numero in 1000..9999){b=true}
            else if (numero<=1000){h=true}
        }
        if (m){println("M")}
        else if (b){println("B")}
        else if (h){println("H")}
    }
}

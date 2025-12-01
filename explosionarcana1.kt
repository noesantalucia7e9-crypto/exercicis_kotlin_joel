import java.util.Scanner
//sinempezar casi
fun main(){
    val scanner = Scanner(System. `in`)
    var danyinicial = scanner.nextInt()
    var hpenemic = scanner.nextInt()
    var cops = 0
    var danyinicial2=danyinicial
    var danytotal = 0

    while (hpenemic>0){
        cops=cops+1
        hpenemic = hpenemic-danyinicial
        danyinicial=danyinicial+danyinicial2
        danytotal=danytotal+danyinicial

    }
    println(cops)
    println(danytotal)
}
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val casosProva = scanner.nextInt()
    repeat(casosProva) {
        val tamanyArray = scanner.nextInt()
        var numArray = Array(tamanyArray) {scanner.nextInt()}
        var segonmespetit = 1
        var mespetit = 1
        var segonmesgran = 1
        var mesgran = 1

        for (i in numArray.indices) {
           if (numArray[i] > mesgran) {mesgran = numArray[i]}
            else if (numArray[i]>segonmesgran && numArray[i]<mesgran) {segonmesgran = numArray[i]}
            else if (numArray[i]<segonmesgran&&numArray[i]< segonmespetit) {mespetit = numArray[i]}
            else if (numArray[i]>mespetit&&numArray[i]<segonmesgran) {segonmespetit = numArray[i]}

        }
//        print("${mespetit+mesgran} ${}")
    }
}
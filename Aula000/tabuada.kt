fun main() {
    print("Digite um número: ")
    val numero = readLine()!!.toInt()
    println("Tabuada do $numero:")
    for (i in 1..10) {
        println("$numero x $i = ${numero * i}")
    }
}

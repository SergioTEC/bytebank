fun main() {
    println("Bem vindo ao Bytebank")

    var i = 0
    while (i < 5) {
        val titular = "Sergio $i"
        val numeroConta = 1000 + i
        var saldo = i + 10

        println("Titular: $titular")
        println("Numero da conta: $numeroConta")
        println("Saldo da conta: $saldo")
        println()
        i++
    }
//    for (i in 5 downTo 1 step 2) {
//        val titular = "Sergio $i"
//        val numeroConta = 1000 + i
//        var saldo = i + 10
//
//        println("Titular: $titular")
//        println("Numero da conta: $numeroConta")
//        println("Saldo da conta: $saldo")
//        println()
//    }
}

fun testaCondicoes(saldo: Double) {

    if (saldo > 0.0) {
        println("Conta Positiva")
    } else if (saldo == 0.0) {
        println("Conta Neutra")
    } else {
        println("Conta Negativa")
    }

    when {
        saldo > 0.0 -> println("Conta Positiva")
        saldo == 0.0 -> println("Conta Neutra")
        else -> println("Conta Negativa")
    }
}
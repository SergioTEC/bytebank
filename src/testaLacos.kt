fun testaLacos() {

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

    for (i in 5 downTo 1 step 2) {
        val titular = "Sergio $i"
        val numeroConta = 1000 + i
        var saldo = i + 10

        println("Titular: $titular")
        println("Numero da conta: $numeroConta")
        println("Saldo da conta: $saldo")
        println()
    }
}
fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Sergio $i"
        val numeroConta: Int = 1000 + i
        val saldo = i + 10.0

        println("Titular $titular")
        println("Numero da conta $numeroConta")
        println("Saldo da conta $saldo")
        println()
        i++
    }
}
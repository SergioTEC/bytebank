fun main() {
    println("Bem vindo ao Bytebank")

    var contaAlex = Conta(titular = "Alex", numeroConta = 1000)
    contaAlex.deposita(100.0)

    var contaFran = Conta(titular = "Fran", numeroConta = 1001)
    contaFran.deposita(200.0)

    println(contaAlex.titular)
    println(contaAlex.numeroConta)
    println(contaAlex.saldo)
    println()

    println(contaFran.titular)
    println(contaFran.numeroConta)
    println(contaFran.saldo)

    println("Depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("Depositando na conta da Fran")
    contaFran.deposita(100.0)
    println(contaFran.saldo)

    println("Sacando na conta do Alex")
    contaAlex.saca(150.0)
    println(contaAlex.saldo)

    println("Sacando na conta da Fran")
    contaFran.saca(50.0)
    println(contaFran.saldo)

    println("Transferindo para a conta do Alex")
    if (contaFran.transfere(destino = contaAlex, valor = 300.0 )) {
        println("Transferência sucedida")
    } else {
        println("Transferência mal sucedida")
    }

    println(contaFran.saldo)
    println(contaAlex.saldo)
}

class Conta(
    var titular: String,
    val numeroConta: Int
) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}

fun testaCopiasEReferencias() {
    //Teste de copia

    var numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("NumeroX $numeroX")
    println("NumeroY $numeroY")

    //Teste de referencia

    var contaJoao = Conta("Joao", 1003)
    var contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println("Conta Joao: ${contaJoao.titular}")
    println("Conta Maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}

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
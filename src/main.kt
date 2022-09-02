fun main() {
    println("Bem vindo ao Bytebank")

    var contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numeroConta = 1000
    contaAlex.setSaldo(100.0)

    var contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numeroConta = 1001
    contaFran.setSaldo(200.0)

    println(contaAlex.titular)
    println(contaAlex.numeroConta)
    println(contaAlex.getSaldo())
    println()

    println(contaFran.titular)
    println(contaFran.numeroConta)
    println(contaFran.getSaldo())

//    println("Depositando na conta do Alex")
//    contaAlex.deposita(50.0)
//    println(contaAlex.getSaldo())
//
//    println("Depositando na conta da Fran")
//    contaFran.deposita(100.0)
//    println(contaFran.getSaldo())
//
//    println("Sacando na conta do Alex")
//    contaAlex.saca(150.0)
//    println(contaAlex.getSaldo())
//
//    println("Sacando na conta da Fran")
//    contaFran.saca(50.0)
//    println(contaFran.getSaldo())
//
//    println("Transferindo para a conta do Alex")
//    if (contaFran.transfere(300.0, contaAlex)) {
//        println("Transferência sucedida")
//    } else {
//        println("Transferência mal sucedida")
//    }
//
//    println(contaFran.getSaldo())
//    println(contaAlex.getSaldo())
}

class Conta {
    var titular = ""
    var numeroConta = 0
    private var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor
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

    fun getSaldo(): Double{
        return saldo
    }

    fun setSaldo(valor: Double){
        if (valor > 0){
            saldo = valor
        }
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

    var contaJoao = Conta()
    contaJoao.titular = "Joao"
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
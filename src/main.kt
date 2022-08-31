fun main() {
    println("Bem vindo ao Bytebank")

    var contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numeroConta = 1000
    contaAlex.saldo = 100.0

    var contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numeroConta = 1001
    contaFran.saldo = 200.0

    println(contaAlex.titular)
    println(contaAlex.numeroConta)
    println(contaAlex.saldo)
    println()

    println(contaFran.titular)
    println(contaFran.numeroConta)
    println(contaFran.saldo)

    println("Depositando na conta do Alex")
    deposita(contaAlex, 50.0)
    println(contaAlex.saldo)

    println("Depositando na conta da Fran")
    deposita(contaFran, 100.0)
    println(contaFran.saldo)

}

fun deposita(conta: Conta, valor: Double){
    conta.saldo += valor
}

class Conta {
    var titular = ""
    var numeroConta = 0
    var saldo = 0.0
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
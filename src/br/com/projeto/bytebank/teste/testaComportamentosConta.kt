import br.com.projeto.bytebank.modelo.ContaCorrente
import br.com.projeto.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {

    var contaAlex = ContaCorrente(titular = "Alex", numeroConta = 1000)
    contaAlex.deposita(200.0)

    var contaFran = ContaPoupanca(titular = "Fran", numeroConta = 1001)
    contaFran.deposita(500.0)

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
    contaAlex.saca(valor = 150.0)
    println(contaAlex.saldo)

    println("Sacando na conta da Fran")
    contaFran.saca(valor = 50.0)
    println(contaFran.saldo)

    println("Transferindo para a conta do Alex")
    if (contaFran.transfere(destino = contaAlex, valor = 300.0)) {
        println("Transferência bem sucedida")
    } else {
        println("Transferência mal sucedida")
    }

    println(contaFran.saldo)
    println(contaAlex.saldo)
}
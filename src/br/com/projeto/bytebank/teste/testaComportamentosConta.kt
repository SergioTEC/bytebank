import br.com.projeto.bytebank.exception.SaldoInsuficienteException
import br.com.projeto.bytebank.modelo.Cliente
import br.com.projeto.bytebank.modelo.ContaCorrente
import br.com.projeto.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {

    var alex = Cliente(nome = "Alex", cpf = "123.345.678-44", senha = 1234)

    var contaAlex = ContaCorrente(titular = alex, numeroConta = 1000)
    contaAlex.deposita(200.0)

    var fran = Cliente(nome = "Fran", cpf = "234.456.567-11", senha = 2345)

    var contaFran = ContaPoupanca(titular = fran, numeroConta = 1001)
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

    try {
        contaFran.transfere(destino = contaAlex, valor = 300.0)
        println("Transferência bem sucedida")
    } catch (e: SaldoInsuficienteException) {
        println("Transferência mal sucedida")
        println("Saldo insuficiente")
        e.printStackTrace()
    }

    println("Saldo Fran: ${contaFran.saldo}")
    println("Saldo Alex: ${contaAlex.saldo}")
}
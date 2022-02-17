import br.com.sergio.bytebank.modelos.Cliente
import br.com.sergio.bytebank.modelos.ContaCorrente
import br.com.sergio.bytebank.modelos.ContaPoupanca
import java.awt.datatransfer.ClipboardOwner

fun testaComportamentosConta() {

    val sergio = Cliente(nome = "Sergio", cpf = "", senha = 1234 )

    val contaSergio = ContaCorrente(titular = sergio, numero = 1)
    contaSergio.deposita(-100.0)


    val fran = Cliente(nome = "Fran", cpf = "", senha = 4321)

    val contaFran = ContaPoupanca(titular = fran, numero = 2)
    contaFran.deposita(200.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaSergio.titular)
    println(contaSergio.numero)
    println(contaSergio.saldo)

    println("Depositando na conta do Sergio")
    contaSergio.deposita(50.0)
    println(contaSergio.saldo)

    println("Depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)


    println("Sacando da conta do Sergio")
    contaSergio.saca(150.0)
    println(contaSergio.saldo)

    println("Sacando da conta da Fran")
    contaFran.saca(70.0)
    println(contaFran.saldo)

    println("Transferencia da conta da Fran para o Sergio")

    if (contaFran.transfere(100.0, contaSergio)) {
        println("Transferencia sucedida")
    } else {
        println("Falha na transferencia")
    }

    print("Saldo Sergio: ")
    println(contaSergio.saldo)
    print("Saldo Fran: ")
    println(contaFran.saldo)
}
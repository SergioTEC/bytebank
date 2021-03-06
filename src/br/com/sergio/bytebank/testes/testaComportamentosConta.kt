import br.com.sergio.bytebank.exceptions.FalhaAutenticacaoException
import br.com.sergio.bytebank.exceptions.SaldoInsuficienteException
import br.com.sergio.bytebank.modelos.Cliente
import br.com.sergio.bytebank.modelos.ContaCorrente
import br.com.sergio.bytebank.modelos.ContaPoupanca

fun testaComportamentosConta() {

    val sergio = Cliente(nome = "Sergio", cpf = "", senha = 1)

    val contaSergio = ContaCorrente(titular = sergio, numero = 1)
    contaSergio.deposita(valor = -100.0)


    val fran = Cliente(nome = "Fran", cpf = "", senha = 2)

    val contaFran = ContaPoupanca(titular = fran, numero = 2)
    contaFran.deposita(valor = 200.0)

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

    try {
        contaFran.transfere(destino = contaSergio, valor = 100.0, senha = 2)
        println("Transferencia sucedida")
    } catch (e: SaldoInsuficienteException) {
        println("Falha na transferencia")
        println("Saldo insuficiente")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException){
        println("Falha na transferencia")
        println("Falha na autenticação")
        e.printStackTrace()
    } catch (e: Exception){
        println("Erro desconhecido")
        e.printStackTrace()
    }
    print("Saldo Sergio: ")
    println(contaSergio.saldo)
    print("Saldo Fran: ")
    println(contaFran.saldo)
}
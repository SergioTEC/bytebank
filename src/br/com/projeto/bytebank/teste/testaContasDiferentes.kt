import br.com.projeto.bytebank.modelo.ContaCorrente
import br.com.projeto.bytebank.modelo.ContaPoupanca
import br.com.projeto.bytebank.modelo.ContaSalario

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Paulo",
        numeroConta = 1001
    )
    contaCorrente.deposita(200.0)

    val contaPoupanca = ContaPoupanca(
        titular = "Joao",
        numeroConta = 1002
    )
    contaPoupanca.deposita(100.0)

    val contaSalario = ContaSalario(
        titular = "Gui",
        numeroConta = 1003
    )
    contaSalario.deposita(100.0)

    println()
    println(contaCorrente.titular)
    println(contaCorrente.numeroConta)
    println(contaCorrente.saldo)

    println()
    println(contaPoupanca.titular)
    println(contaPoupanca.numeroConta)
    println(contaPoupanca.saldo)

    println()
    println(contaSalario.titular)
    println(contaSalario.numeroConta)
    println(contaSalario.saldo)

    println()
    println("Sacando da conta corrente")
    contaCorrente.saca(valor = 50.0)
    println(contaCorrente.saldo)

    println()
    println("Sacando da conta poupança")
    contaPoupanca.saca(valor = 50.0)
    println(contaPoupanca.saldo)

    println()
    println("Sacando da conta salario")
    contaSalario.saca(valor = 50.0)
    println(contaSalario.saldo)

    println()
    println("Transferindo da conta corrente para a conta poupança")
    contaCorrente.transfere(valor = 20.0, contaPoupanca)
    println("Saldo conta corrente: ${contaCorrente.saldo}")
    println("Saldo conta poupança: ${contaPoupanca.saldo}")

    println()
    println("Transferindo da conta corrente para a conta salario")
    contaCorrente.transfere(valor = 20.0, contaSalario)
    println("Saldo conta corrente: ${contaCorrente.saldo}")
    println("Saldo conta salario: ${contaSalario.saldo}")

    println()
    println("Transferindo da conta poupança para a conta salario")
    contaPoupanca.transfere(valor = 20.0, contaSalario)
    println("Saldo conta poupança: ${contaPoupanca.saldo}")
    println("Saldo conta salario: ${contaSalario.saldo}")

//    br.com.projeto.bytebank.modelo.Conta salario não pode transferir
//    println()
//    println("Transferindo da conta salario para a conta corrente")
//    contaSalario.transfere(valor = 20.0, contaCorrente)
//    println("Saldo conta salario: ${contaSalario.saldo}")
//    println("Saldo conta corrente: ${contaCorrente.saldo}")
}
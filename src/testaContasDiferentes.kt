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

    println()
    println(contaCorrente.titular)
    println(contaCorrente.numeroConta)
    println(contaCorrente.saldo)

    println()
    println(contaPoupanca.titular)
    println(contaPoupanca.numeroConta)
    println(contaPoupanca.saldo)

    println()
    println("Sacando da conta corrente")
    contaCorrente.saca(valor = 50.0)
    println(contaCorrente.saldo)

    println()
    println("Sacando da conta poupança")
    contaPoupanca.saca(valor = 50.0)
    println(contaPoupanca.saldo)

    println()
    println("Transferindo da conta corrente para a conta poupança")
    contaCorrente.transfere(valor = 20.0, contaPoupanca)
    println("Saldo conta corrente: ${contaCorrente.saldo}")
    println("Saldo conta poupança: ${contaPoupanca.saldo}")
}
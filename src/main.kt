fun main() {
    println("Bem vindo ao Bytebank")

    val contaCorrente = ContaCorrente(
        titular = "Sergio",
        numero = 8
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Heitor",
        numero = 10
    )

    contaCorrente.deposita(valor = 1000.0)
    contaPoupanca.deposita(valor = 1000.0)

    println("Saldo da conta Corrente: ${contaCorrente.saldo}")
    println("Saldo da conta Poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(valor = 100.0)
    contaPoupanca.saca(valor = 200.0)

    println("Após o saque, o saldo da conta Corrente é: ${contaCorrente.saldo}")
    println("Após o saque, o saldo da conta Poupança é: ${contaPoupanca.saldo}")

    contaCorrente.transfere(valor = 100.0, destino = contaPoupanca)
    println("Após a transferência da conta Corrente para a conta Poupança o saldo da conta Corrente é: ${contaCorrente.saldo} ")

    contaPoupanca.transfere(valor = 200.0, destino = contaCorrente)
    println("Após a transferência da conta Poupança para a conta Corrente o saldo da conta Poupança é: ${contaPoupanca.saldo}")

    println("""Após a transferência de ambas as contas 
        |o saldo da conta Corrente ficou: ${contaCorrente.saldo} 
        |e o da conta Poupança ficou: ${contaPoupanca.saldo}""".trimMargin())
}
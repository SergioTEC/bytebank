fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Sergio",
        numero = 8
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Heitor",
        numero = 10
    )

    val contaSalario = ContaSalario(
        titular = "Gui",
        numero = 1
    )

    contaCorrente.deposita(valor = 1000.0)
    contaPoupanca.deposita(valor = 1000.0)
    contaSalario.deposita(valor = 1000.0)

    println("Saldo da conta Corrente: ${contaCorrente.saldo}")
    println("Saldo da conta Poupança: ${contaPoupanca.saldo}")
    println("Saldo da conta Salario: ${contaSalario.saldo}")


    contaCorrente.saca(valor = 100.0)
    contaPoupanca.saca(valor = 200.0)
    contaSalario.saca(valor = 100.0)

    println("Após o saque, o saldo da conta Corrente é: ${contaCorrente.saldo}")
    println("Após o saque, o saldo da conta Poupança é: ${contaPoupanca.saldo}")
    println("Após o saque, o saldo da conta Salario é: ${contaSalario.saldo}")


    contaCorrente.transfere(valor = 100.0, destino = contaPoupanca)
    println("Após a transferência da conta Corrente para a conta Poupança o saldo da conta Corrente é: ${contaCorrente.saldo} ")

    contaPoupanca.transfere(valor = 200.0, destino = contaCorrente)
    println("Após a transferência da conta Poupança para a conta Corrente o saldo da conta Poupança é: ${contaPoupanca.saldo}")

    println(
        """Após a transferência de ambas as contas 
        |o saldo da conta Corrente ficou: ${contaCorrente.saldo} 
        |e o da conta Poupança ficou: ${contaPoupanca.saldo}""".trimMargin()
    )
    contaCorrente.transfere(100.0, contaSalario)

    println("saldo Conta corrente após transferir para salário: ${contaCorrente.saldo}")
    println("saldo Conta salário após receber transferência: ${contaSalario.saldo}")
}
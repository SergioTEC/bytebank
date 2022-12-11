import br.com.projeto.bytebank.modelo.*

fun testaContasDiferentes() {

    var paulo = Cliente(nome = "Paulo", cpf = "346.122.645-66", senha = 5678, endereco = Endereco("Rua Kotlin"))

    val contaCorrente = ContaCorrente(
        titular = paulo,
        numeroConta = 1001
    )
    contaCorrente.deposita(200.0)

    println("titular ${contaCorrente.titular}")
    println("nome do titular: ${contaCorrente.titular.nome}")
    println("cpf do titular: ${contaCorrente.titular.cpf}")
    println("endereco do titular: ${contaCorrente.titular.endereco.logradouro}")

    var joao = Cliente(nome = "Joao", cpf = "236.142.655-96", senha = 2345)

    val contaPoupanca = ContaPoupanca(
        titular = joao,
        numeroConta = 1002
    )
    contaPoupanca.deposita(100.0)

    var gui = Cliente(nome = "Gui", cpf = "146.678.853-65", senha = 2336)

    val contaSalario = ContaSalario(
        titular = gui,
        numeroConta = 1003
    )
    contaSalario.deposita(100.0)

    println()
    println(contaCorrente.titular.nome)
    println(contaCorrente.numeroConta)
    println(contaCorrente.saldo)

    println()
    println(contaPoupanca.titular.nome)
    println(contaPoupanca.numeroConta)
    println(contaPoupanca.saldo)

    println()
    println(contaSalario.titular.nome)
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
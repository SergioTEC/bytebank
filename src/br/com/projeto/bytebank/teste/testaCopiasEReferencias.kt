import br.com.projeto.bytebank.modelo.Cliente
import br.com.projeto.bytebank.modelo.ContaCorrente
import br.com.projeto.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    //Teste de copia

    var numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("NumeroX $numeroX")
    println("NumeroY $numeroY")

    //Teste de referencia

    val joao = Cliente(nome = "Joao", cpf = "213.345.762-77", senha = 1048)
    var contaJoao = ContaCorrente(joao, 1003)
    contaJoao.titular.nome = "Joao"
    var contaMaria = ContaPoupanca(Cliente(nome = "Maria", cpf = "234.632.567-11", senha = 2389), 1004)
    contaMaria.titular.nome = "Maria"

    println("br.com.projeto.bytebank.modelo.Conta Joao: ${contaJoao.titular}")
    println("br.com.projeto.bytebank.modelo.Conta Maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}
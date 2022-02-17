import br.com.sergio.bytebank.modelos.Cliente
import br.com.sergio.bytebank.modelos.ContaCorrente
import br.com.sergio.bytebank.modelos.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente(nome = "Joao", cpf = "", senha = 1002)
    val contaJoao = ContaCorrente(titular = joao, numero = 1002)
    contaJoao.titular = joao

    val maria = Cliente(nome = "Maria", cpf = "", senha = 1002)
    val contaMaria = ContaPoupanca(titular = maria, numero = 1003)
    contaMaria.titular = maria

    println("titular conta Joao: ${contaJoao.titular}")
    println("titular conta Maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}
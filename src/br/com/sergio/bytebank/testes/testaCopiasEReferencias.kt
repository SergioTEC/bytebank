import br.com.sergio.bytebank.modelos.ContaCorrente
import br.com.sergio.bytebank.modelos.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = ContaCorrente("João", 1002)
    contaJoao.titular = "João"
    val contaMaria = ContaPoupanca("Maria", 1003)
    contaMaria.titular = "Maria"

    println("titular conta Joao: ${contaJoao.titular}")
    println("titular conta Maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}
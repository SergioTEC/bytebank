import br.com.sergio.bytebank.exceptions.SaldoInsuficienteException

fun main() {
    println("Inicio main")
    testaComportamentosConta()
    println("Fim main")
}

fun funcao1() {
    println("Inicio funcao1")
    try {
        funcao2()
    } catch (e: SaldoInsuficienteException) {
        e.printStackTrace()
        println("SaldoInsuficienteException foi Identificada")
    }
    println("Fim funcao1")
}

fun funcao2() {
    println("Inicio funcao2")
    for (i in 1..5) {
        println(i)
        throw SaldoInsuficienteException()
    }
    println("Fim funcao2")
}
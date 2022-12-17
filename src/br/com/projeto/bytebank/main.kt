import br.com.projeto.bytebank.modelo.Endereco

fun main() {
    println("início main")

    val entrada: String = "1.1"

    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na Conversao")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }

    if (valorComTaxa != null) {
        println("Valor recebido: $valorComTaxa")
    } else {
        println("Valor invalido")
    }

    funcao1()
    println("fim main")
}

fun funcao1() {
    println("início funcao1")
    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")

    try {
        for (i in 1..5) {
            println(i)
            //Simulando uma exception
            val endereco = Any()
            endereco as Endereco
        }
    } catch (e: ClassCastException) {
        println("Houve uma Exception relacionada a ClassCastException")
        e.printStackTrace()
    }

    println("fim funcao2")
}
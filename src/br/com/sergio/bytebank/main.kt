import kotlin.ClassCastException

fun main() {
    println("Inicio main")
    val entrada: String = "1.0"

    val valorRecebido: Double? = try {
        entrada.toDouble()
    }catch (e: NumberFormatException){
        println("Problema na conversão")
        e.printStackTrace()
        null
    }
    val valorComTaxa: Double? = if(valorRecebido != null)
        valorRecebido + 0.1
    else{
        null
    }

    if(valorComTaxa != null){
        println("Valor recebido: $valorComTaxa")
    }else{
        println("Valor invalido")
    }


    funcao1()
    println("Fim main")
}

fun funcao1() {
    println("Inicio funcao1")
    try {
        funcao2()
    } catch (e: ClassCastException) {
        e.printStackTrace()
        println("ClassCastException foi Identificada")
    }
    println("Fim funcao1")
}

fun funcao2() {
    println("Inicio funcao2")
    for (i in 1..5) {
        println(i)
//        val endereco = Any()
//        endereco as Endereco
    }
    println("Fim funcao2")
}

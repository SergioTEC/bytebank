package br.com.sergio.bytebank.testes

import br.com.sergio.bytebank.exceptions.SaldoInsuficienteException

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
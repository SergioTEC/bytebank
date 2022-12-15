package br.com.projeto.bytebank.teste

import br.com.projeto.bytebank.modelo.Endereco

fun testaAny() {
    val endereco = Endereco(logradouro = "Rua São Jõao", numero = 100, cep = "10000-222")
    val enderecoNovo = Endereco(logradouro = "Rua São Jõao", numero = 100, cep = "10000-222")


    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco)
}
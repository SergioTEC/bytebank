package br.com.sergio.bytebank.testes

import br.com.sergio.bytebank.modelos.*

fun testaObjects() {
    val diego = object : Autenticavel {
        val nome: String = "Diego"
        val cpf: String = "111.222.333-44"
        val senha: Int = 1234

        override fun autentica(senha: Int) = this.senha == senha
    }
    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(diego, senha = 1234)

    println("Nome do Cliente: ${diego.nome}")
    println()

    val gabriel = Cliente(nome = "Gabriel", cpf = "", senha = 2)
    val contaPoupanca = ContaPoupanca(titular = gabriel, numero = 2)
    val contaCorrente = ContaCorrente(titular = gabriel, numero = 3)
    println("Total de contas criadas é: ${Conta.totalContas}")
}
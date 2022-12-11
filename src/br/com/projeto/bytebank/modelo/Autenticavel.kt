package br.com.projeto.bytebank.modelo

interface Autenticavel {
    fun autentica(senha: Int): Boolean
}
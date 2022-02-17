package br.com.sergio.bytebank.modelos

interface Autenticavel {
    fun autentica(senha: Int): Boolean
}
package br.com.sergio.bytebank.exceptions

class SaldoInsuficienteException(
    mensagem: String = "O Saldo é insuficiente"
) : Exception(mensagem)

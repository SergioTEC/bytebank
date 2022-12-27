package br.com.projeto.bytebank.modelo

import br.com.projeto.bytebank.exception.SaldoInsuficienteException

abstract class ContaTransferivel(
    titular: Cliente,
    numeroConta: Int
) : Conta(
    titular = titular,
    numeroConta = numeroConta
) {

    fun transfere(valor: Double, destino: Conta){
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
        } else {
            return throw SaldoInsuficienteException(mensagem = "Saldo insuficiente, saldo atual: ${saldo}, valor a ser sacado: ${valor}")
        }
    }
}
package br.com.sergio.bytebank.modelos

import br.com.sergio.bytebank.exceptions.SaldoInsuficienteException

abstract class ContaTransferivel(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    fun transfere(valor: Double, destino: Conta){
        if (saldo < valor) {
            throw SaldoInsuficienteException()
        } else {
        saldo -= valor
        destino.deposita(valor)
        }
    }
}
package br.com.projeto.bytebank.modelo

abstract class ContaTransferivel(
    titular: Cliente,
    numeroConta: Int
) : Conta(
    titular = titular,
    numeroConta = numeroConta
) {

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}
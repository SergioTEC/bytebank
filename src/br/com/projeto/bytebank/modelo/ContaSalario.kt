package br.com.projeto.bytebank.modelo

class ContaSalario(
    titular: Cliente,
    numeroConta: Int
) : Conta(
    titular = titular,
    numeroConta = numeroConta
) {
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}
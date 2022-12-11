package br.com.projeto.bytebank.modelo

class ContaPoupanca(
    titular: String,
    numeroConta: Int
) : ContaTransferivel(
    titular = titular,
    numeroConta = numeroConta
) {
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}
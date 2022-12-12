import br.com.projeto.bytebank.modelo.*

fun main() {
    testaContasDiferentes()

    val fran = object: Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "111.111.111-22"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 1000)

    println("Nome do cliente ${fran.nome}")

    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = alex, numeroConta = 1000)
    println("Total de contas: ${Conta.total}")
}
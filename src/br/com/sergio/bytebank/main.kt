import br.com.sergio.bytebank.modelos.Endereco

fun main() {
    val endereco = Endereco(logradouro = "Rua Treze de Maio", numero = 43, bairro = "Vila Europa", complemento = "Ap", cep = "94027")
    val novoEndereco = Endereco(logradouro = "Rua Treze de Maio", numero = 43, bairro = "Vila Europa", complemento = "Ap", cep = "94027")

    println(endereco.equals(novoEndereco))

    println(endereco.toString())
    println(novoEndereco)

    println(endereco.hashCode())
    println(novoEndereco.hashCode())
}
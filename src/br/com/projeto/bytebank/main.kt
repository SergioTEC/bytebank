import br.com.projeto.bytebank.modelo.Endereco

fun main() {

    val endereco = Endereco(logradouro = "Rua São Jõao", numero = 100, cep = "10000-222")
    val enderecoNovo = Endereco(logradouro = "Rua São Jõao", numero = 100, cep = "10000-222")


    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco)
}
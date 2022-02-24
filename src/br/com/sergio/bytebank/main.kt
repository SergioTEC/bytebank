import br.com.sergio.bytebank.modelos.Endereco

fun main() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua São João", complemento = "Casa")
    val logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let { endereco: Endereco ->
        println(endereco.logradouro.length)
        val tamanhoComplemento: Int =
            endereco.complemento?.length ?: throw IllegalStateException("Complemento não pode estar vazio")
        println(tamanhoComplemento)
    }
// exemplo de Safe Cast
//    teste("")
//    teste(1)
}

//fun teste(valor: Any){
//    val numero: Int? = valor as? Int
//    println(numero)
//}
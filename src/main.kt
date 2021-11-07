fun main() {
    println("Bem vindo ao Bytebank")

    val sergio = Funcionario(
        nome = "Sergio",
        cpf = "111.222.333-44",
        salario = 1000.0
    )

    println("Nome: ${sergio.nome}")
    println("CPF: ${sergio.cpf}")
    println("Salario: ${sergio.salario}")
    println("Bonificação: ${sergio.bonificacao()}")
    println()

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.333.444-55",
        salario = 2000.0,
        senha = 1234

    )

    println("Nome: ${fran.nome}")
    println("CPF: ${fran.cpf}")
    println("Salario: ${fran.salario}")
    println("Bonificação: ${fran.bonificacao()}")

    if (fran.autenticacao(senha = 1234)){
        println("Autenticado com sucesso")
    } else {
        println("Não autenticado")
    }
}
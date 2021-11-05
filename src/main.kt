fun main() {
    println("Bem vindo ao Bytebank")

    val sergio = Funcionario(nome = "Sergio", cpf = "111.222.333-44", salario = 1000.0)

    println("Nome: ${sergio.nome}")
    println("CPF: ${sergio.cpf}")
    println("Salario: ${sergio.salario}")
    println("Bonificação: ${sergio.bonificacao()}")
}
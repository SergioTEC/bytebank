fun testaFuncionario() {

    val sergio = Auxiliar(
        nome = "Sergio",
        cpf = "111.222.333-44",
        salario = 1000.0
    )

    println("Nome: ${sergio.nome}")
    println("CPF: ${sergio.cpf}")
    println("Salario: ${sergio.salario}")
    println("Bonificação: ${sergio.bonificacao}")
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
    println("Bonificação: ${fran.bonificacao}")

    if (fran.autentica(senha = 1234)) {
        println("Autenticado com sucesso")
    } else {
        println("Não autenticado")
    }
    println()

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.444.555-66",
        salario = 4000.0,
        senha = 4321,
        plr = 200.0
    )

    println("Nome: ${gui.nome}")
    println("CPF: ${gui.cpf}")
    println("Salario: ${gui.salario}")
    println("Bonificação: ${gui.bonificacao}")
    println("PLR: ${gui.plr}")

    if (gui.autentica(senha = 4321)) {
        println("Autenticado com sucesso")
    } else {
        println("Não autenticado")
    }

    val maria = Analista(
        nome = "Maria",
        cpf = "444.555.666-77",
        salario = 3000.0
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(sergio)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("Total de bonificação: ${calculadora.total}")
}
fun main() {
    println("Bem vindo ao Bytebank")

    val alex = Funcionario(
        nome = "Alex",
        cpf = "123.234.345-45",
        salario = 1000.0
    )

    println()
    println("Nome: ${alex.nome}")
    println("CPF: ${alex.cpf}")
    println("Salario: ${alex.salario}")

    println("Bonificação: ${alex.bonificacao()}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "234.345.456-56",
        salario = 2000.0,
        senha = 1234
    )

    println()
    println("Nome: ${fran.nome}")
    println("CPF: ${fran.cpf}")
    println("Salario: ${fran.salario}")

    println("Bonificação: ${fran.bonificacao()}")
    if (fran.autentica(senha = 1234)){
        println("Autenticação concluida com sucesso")
    } else{
        println("Autenticação não concluida")
    }

    val gui = Diretor(
        nome = "Gui",
        cpf = "345.456.567-67",
        salario = 3000.0,
        senha = 3000,
        plr = 200
    )

    println()
    println("Nome: ${gui.nome}")
    println("CPF: ${gui.cpf}")
    println("Salario: ${gui.salario}")
    println("PLR: ${gui.plr}")

    println("Bonificação: ${gui.bonificacao()}")
    if (gui.autentica(senha = 3000)){
        println("Autenticação concluida com sucesso")
    } else{
        println("Autenticação não concluida")
    }

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)

    println("Valor total da bonificação: ${calculadora.total}")
}
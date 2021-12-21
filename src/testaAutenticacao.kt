fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Sergio",
        cpf = "111.222.333-44",
        salario = 3000.0,
        senha = 1234
    )

    val diretor = Diretor(
        nome = "Junior",
        cpf = "222.333.444-55",
        salario = 3500.0,
        senha = 4321,
        plr = 120.0
    )

    val cliente = Cliente(
        nome = "Gui",
        cpf = "777.888.999-00",
        senha = 9876
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, senha = 1234)
    sistema.entra(diretor, senha = 4321)
    sistema.entra(cliente, senha = 9876)
}
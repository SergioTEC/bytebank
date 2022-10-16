fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Alex",
        cpf = "111.111.111-22",
        salario = 1000.0,
        senha = 1234
    )

    val diretor = Diretor(
        nome = "Fran",
        cpf = "222.222.222-33",
        salario = 2000.0,
        senha = 4321,
        plr = 200.0
    )

    val cliente = Cliente(
        nome = "Gui",
        cpf = "333.333.333-44",
        senha = 2345
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, senha = 1234)
    sistema.entra(diretor, senha = 4321)
    sistema.entra(cliente, senha = 2345)
}
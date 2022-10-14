fun testaCopiasEReferencias() {
    //Teste de copia

    var numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("NumeroX $numeroX")
    println("NumeroY $numeroY")

    //Teste de referencia

    var contaJoao = ContaCorrente("Joao", 1003)
    var contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println("Conta Joao: ${contaJoao.titular}")
    println("Conta Maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}
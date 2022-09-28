class CalculadoraBonificacao {

    var total: Double = 0.0

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao()
    }

//    fun registra(funcionario: Gerente) {
//        this.total += funcionario.bonificacao()
//    }
//
//    fun registra(funcionario: Diretor) {
//        this.total += funcionario.bonificacao()
//    }
}
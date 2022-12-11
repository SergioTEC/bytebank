fun testaCondicoes(saldo: Double) {

    if (saldo > 0.0) {
        println("br.com.projeto.bytebank.modelo.Conta Positiva")
    } else if (saldo == 0.0) {
        println("br.com.projeto.bytebank.modelo.Conta Neutra")
    } else {
        println("br.com.projeto.bytebank.modelo.Conta Negativa")
    }

    when {
        saldo > 0.0 -> println("br.com.projeto.bytebank.modelo.Conta Positiva")
        saldo == 0.0 -> println("br.com.projeto.bytebank.modelo.Conta Neutra")
        else -> println("br.com.projeto.bytebank.modelo.Conta Negativa")
    }
}
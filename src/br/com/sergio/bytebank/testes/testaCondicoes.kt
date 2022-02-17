fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("br.com.sergio.bytebank.modelos.Conta é Positiva")
    } else if (saldo == 0.0) {
        println("br.com.sergio.bytebank.modelos.Conta é neutra")
    } else println("br.com.sergio.bytebank.modelos.Conta é Negativa")

    when {
        saldo > 0.0 -> println("br.com.sergio.bytebank.modelos.Conta é Positiva")
        saldo == 0.0 -> println("br.com.sergio.bytebank.modelos.Conta é neutra")
        else -> println("br.com.sergio.bytebank.modelos.Conta é Negativa")
    }
}
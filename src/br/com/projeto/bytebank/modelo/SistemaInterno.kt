package br.com.projeto.bytebank.modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao Bytebank")
        } else{
            println("Falha na autenticação")
        }
    }
}
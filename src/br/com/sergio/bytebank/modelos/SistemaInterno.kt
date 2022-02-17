package br.com.sergio.bytebank.modelos

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int){
        if(admin.autentica(senha)){
            println("Bem vindo ao ByteBank")
        } else {
            println("Falha na autenticação")
        }
    }
}
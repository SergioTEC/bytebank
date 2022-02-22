package br.com.sergio.bytebank.exceptions

class FalhaAutenticacaoException(
    mensagem: String = "Falha na autenticação"
): Exception(mensagem)
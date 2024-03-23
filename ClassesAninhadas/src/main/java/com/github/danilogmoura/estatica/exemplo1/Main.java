package com.github.danilogmoura.estatica.exemplo1;

public class Main {

    public static void main(String[] args) {
        ServicoEmail servico = new ServicoEmail();

        ServicoEmail.Mensagem mensagem = new ServicoEmail.Mensagem(
                "joao@email.com", "maria@email.com", "Olá, tudo bem?");

        servico.enviar(mensagem);
    }
}

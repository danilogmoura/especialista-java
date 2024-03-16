package com.github.danilogmoura;

public class Main {

    public static void main(String[] args) {
        var servicoCadastroAnuncio = new ServicoCadastroAnuncio();
        servicoCadastroAnuncio.cadastrar("123", "Teste");
    }
}

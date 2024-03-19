package com.github.danilogmoura;

public class ExtracaoNome {

    public static void main(String[] args) {

        String nome = "João Silva Souza";

//        System.out.println(nome.substring(0, nome.indexOf(" ")));
//        System.out.println(nome.substring(nome.indexOf(" ") + 1));

        System.out.println(obterSobreNome(nome));
        System.out.println(obterSegundoNome(nome));
        System.out.println(obterUltimoNome(nome));
    }

    private static String obterSobreNome(String nome) {
        int posicaoPrimeiroEspaco = nome.indexOf(" ");

        if (posicaoPrimeiroEspaco < 0) {
            throw new RuntimeException("Não é um nome completo");
        }

        return nome.substring(posicaoPrimeiroEspaco + 1);
    }

    private static String obterSegundoNome(String nome) {
        int posicaoPrimeiroEspaco = nome.indexOf(" ");
        int posicaoSegundoEspaco = nome.indexOf(" ", posicaoPrimeiroEspaco + 1);

        if (posicaoPrimeiroEspaco < 0) {
            throw new RuntimeException("Não é um nome completo");
        }

        return nome.substring(posicaoPrimeiroEspaco + 1, posicaoSegundoEspaco < 0 ? nome.length() : posicaoSegundoEspaco);
    }

    private static String obterUltimoNome(String nome) {
        int posicaoPrimeiroEspaco = nome.lastIndexOf(" ");

        if (posicaoPrimeiroEspaco < 0) {
            throw new RuntimeException("Não é um nome completo");
        }

        return nome.substring(posicaoPrimeiroEspaco + 1);
    }
}

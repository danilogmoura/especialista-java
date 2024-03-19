package com.github.danilogmoura;

public class Replace {

    public static void main(String[] args) {
        String nome = "Pedro da Silva da Costa de Oliveira";

        var replace = nome.replace('a', '@');

        System.out.println(nome);
        System.out.println(replace);
    }
}

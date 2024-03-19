package com.github.danilogmoura;

public class Strip {

    public static void main(String[] args) {
        String nome = "\n    Pedro    ";

        var strip = nome.strip();

        System.out.println(">" + nome + "<");
        System.out.println(">" + strip + "<");
    }
}

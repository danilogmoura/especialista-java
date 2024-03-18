package com.github.danilogmoura;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Contato> contatos = new LinkedHashSet<>();

        System.out.println("---");
        contatos.add(new Contato("Maria", "maria@gmail.com", 40));
        contatos.add(new Contato("Ana", "ana@gmail.com", 30));
        contatos.add(new Contato("José", "jose@gmail.com", 25));
        contatos.add(new Contato("Rosa", "rosa@gmail.com", 50));
        contatos.add(new Contato("João", "joao@gmail.com", 70));
        System.out.println("---");

        contatos.add(null);


        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }
}

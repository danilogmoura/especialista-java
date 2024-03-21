package com.github.danilogmoura.adicionandosubtraindo;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalDate semanaPassada = hoje.minusWeeks(1);

        System.out.println(hoje);
        System.out.println(semanaPassada);
    }
}

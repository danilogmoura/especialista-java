package com.github.danilogmoura.period;

import java.time.LocalDate;
import java.time.Period;

public class Main3 {
    public static void main(String[] args) {
        Period tempoMedioEntrega = Period.parse("P1M5D");
        LocalDate hoje = LocalDate.now();

        var dataPrevisaoEntrega = hoje.plus(tempoMedioEntrega);

        System.out.println(hoje);
        System.out.println(dataPrevisaoEntrega);
    }
}

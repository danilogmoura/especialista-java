package com.github.danilogmoura.adjusters;

import java.time.LocalDate;

public class Main2 {

    public static void main(String[] args) {
        LocalDate dataHoje = LocalDate.now();
        System.out.println(dataHoje);

        LocalDate dataNatal = dataHoje.with(new NatalTemporalAjuster());
        System.out.println(dataNatal);
    }
}

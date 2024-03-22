package com.github.danilogmoura.period;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main2 {

    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.parse("2022-09-15");
        LocalDate dataEntrega = LocalDate.parse("2022-11-12");

//        Period tempoEntrega = Period.between(dataCompra, dataEntrega);
        Period tempoEntrega = dataCompra.until(dataEntrega);
        System.out.println(tempoEntrega);

        var semanas = dataCompra.until(dataEntrega, ChronoUnit.WEEKS);
        System.out.printf("%s semanas%n", semanas);

        long tempoEntragaSemanas = ChronoUnit.WEEKS.between(dataCompra, dataCompra);
        System.out.printf("%s semanas %n", tempoEntragaSemanas);
    }
}

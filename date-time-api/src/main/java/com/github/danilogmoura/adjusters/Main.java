package com.github.danilogmoura.adjusters;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Main {

    public static void main(String[] args) {
        LocalDate dataHoje = LocalDate.now();
        System.out.println(dataHoje);

        LocalDate primeiraSegundaProximoMes = dataHoje.plusMonths(1)
                                                      .with(TemporalAdjusters.lastInMonth(DayOfWeek.MONDAY));

        System.out.println(primeiraSegundaProximoMes);

        LocalDate ultimoDiaDoMes = dataHoje.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(ultimoDiaDoMes);

        LocalDate dataProximaSextaFeira = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
        System.out.println(dataProximaSextaFeira);
    }
}

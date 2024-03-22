package com.github.danilogmoura.dayofweek;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//        DayOfWeek diaDaSemana = DayOfWeek.MONDAY;
//        DayOfWeek diaDaSemana = DayOfWeek.of(1);
//        DayOfWeek diaDaSemana = DayOfWeek.from(LocalDate.now());
        DayOfWeek diaDaSemana = LocalDate.now().getDayOfWeek();
        System.out.println(diaDaSemana);

//        System.out.println(diaDaSemana.getDisplayName(
//                TextStyle.FULL_STANDALONE, Locale.of("pt", "BR")));

        System.out.println(DateTimeFormatter.ofPattern("E")
                                   .withLocale(Locale.of("pt", "BR"))
                                   .format(diaDaSemana));
    }
}

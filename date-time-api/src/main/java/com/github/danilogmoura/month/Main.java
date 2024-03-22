package com.github.danilogmoura.month;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
//        LocalDate dataNascimento = LocalDate.parse("1981-09-13");
        LocalDate dataNascimento = LocalDate.of(1981, Month.SEPTEMBER, 13);

//        Month mes = Month.SEPTEMBER;
//        Month mes = Month.of(9);
//        Month mes = Month.from(dataNasciento);
        Month mes = dataNascimento.getMonth();
        System.out.println(mes);

//        System.out.println(mes.getDisplayName(TextStyle.FULL_STANDALONE, Locale.of("pt", "BR")));

        System.out.println(DateTimeFormatter.ofPattern("MMMM")
                                   .withLocale(Locale.of("pt", "BR")).format(dataNascimento));
    }
}

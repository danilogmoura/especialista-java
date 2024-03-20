package com.github.danilogmoura.formatando;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime dataHora = LocalDateTime.now();

//        DateTimeFormatter formatador = DateTimeFormatter.ISO_DATE;

//        DateTimeFormatter formatador = DateTimeFormatter
//                                               .ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT)
//                                               .withLocale(Locale.of("pt", "BR"));

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy 'as' HH:mm:ss");

//        System.out.println(dataHora);
//        System.out.println(formatador.format(dataHora));
        System.out.println(dataHora.format(formatador));
    }
}

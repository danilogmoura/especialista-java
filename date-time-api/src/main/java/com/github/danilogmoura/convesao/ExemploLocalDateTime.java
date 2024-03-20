package com.github.danilogmoura.convesao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ExemploLocalDateTime {

    public static void main(String[] args) {
//        LocalDateTime dataHora = LocalDateTime.parse("2016-10-03T21:03");
        LocalDateTime dataHora = LocalDateTime.parse("03/10/2026 21:03:19", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        System.out.println(dataHora);
    }
}

package com.github.danilogmoura.OffsetDeslocamentoUTC;

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
//        OffsetDateTime dataHora = OffsetDateTime.now();
//        OffsetDateTime dataHora = OffsetDateTime.now(ZoneId.of("America/Los_Angeles"));
//        OffsetDateTime dataHora = OffsetDateTime.now(ZoneOffset.ofHours(5));
        OffsetDateTime dataHora = OffsetDateTime.parse("2023-09-13T20:00:00-03:00");

        System.out.println(dataHora);
        System.out.println(dataHora.getOffset());

    }
}

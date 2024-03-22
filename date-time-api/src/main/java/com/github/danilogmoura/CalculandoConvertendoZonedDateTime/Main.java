package com.github.danilogmoura.CalculandoConvertendoZonedDateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime dataHoraFusoPadrao = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        LocalDateTime dataHoraSemFuso = dataHoraFusoPadrao.toLocalDateTime();

        System.out.println(dataHoraFusoPadrao);
        System.out.println(dataHoraSemFuso);


    }
}

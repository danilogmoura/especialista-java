package com.github.danilogmoura.ZonedDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {

        ZonedDateTime dataHoraFusoPadrao = ZonedDateTime.now();
        ZonedDateTime dataHoraLosAngeles = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println(dataHoraFusoPadrao);
        System.out.println(dataHoraLosAngeles);

        System.out.println(dataHoraFusoPadrao.getOffset());
        System.out.println(dataHoraFusoPadrao.getZone());
    }
}

package com.github.danilogmoura.horarioespecifico;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main2 {

    public static void main(String[] args) {

        ZoneId fusoLosAngeles = ZoneId.of("America/Los_Angeles");
        ZoneId fusoSaoPaulo = ZoneId.of("America/Sao_Paulo");
        ZoneId fusoJapao = ZoneId.of("Japan");

        LocalDateTime dataHoraLosAngeles = LocalDateTime.now(fusoLosAngeles);
        LocalDateTime dataHoraJapao = LocalDateTime.now(fusoJapao);
        LocalDateTime dataHoraSaoPaulo = LocalDateTime.now(fusoSaoPaulo);

        System.out.println(dataHoraLosAngeles);
        System.out.println(dataHoraJapao);
        System.out.println(dataHoraSaoPaulo);
    }
}

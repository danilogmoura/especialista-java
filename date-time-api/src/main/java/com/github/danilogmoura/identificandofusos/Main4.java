package com.github.danilogmoura.identificandofusos;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main4 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);

        ZoneId fusoSaoPaulo = ZoneId.of("America/Sao_Paulo");
        LocalDateTime dataHora = LocalDateTime.ofInstant(instant, fusoSaoPaulo);
        System.out.println(dataHora);
    }
}

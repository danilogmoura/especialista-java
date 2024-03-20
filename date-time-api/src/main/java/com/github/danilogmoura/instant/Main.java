package com.github.danilogmoura.instant;

import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        Instant instante = Instant.now();
        System.out.println(instante);

        System.out.println(instante.getEpochSecond());
        System.out.println(instante.getNano());

        System.out.println(instante.toEpochMilli());
    }
}

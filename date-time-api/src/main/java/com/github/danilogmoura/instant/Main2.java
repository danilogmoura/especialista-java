package com.github.danilogmoura.instant;

import java.time.Instant;
import java.util.Date;

public class Main2 {

    public static void main(String[] args) {

        Instant instante = Instant.now();

        Date data = Date.from(instante);

        System.out.println(instante);
        System.out.println(data);
    }
}

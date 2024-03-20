package com.github.danilogmoura.convesao;

import java.time.Instant;

public class ExemploInstant {

    public static void main(String[] args) {
//        Instant instant = Instant.parse("2010-08-20T19:46:20-00:00");
//        Instant instant = Instant.parse("2010-08-20T19:46:20Z");
        Instant instant = Instant.parse("2010-08-20T19:46:20-03:00");

        System.out.println(instant);


    }
}

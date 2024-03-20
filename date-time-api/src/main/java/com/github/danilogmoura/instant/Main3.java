package com.github.danilogmoura.instant;

import java.time.Instant;
import java.util.Date;

public class Main3 {

    public static void main(String[] args) {

        Date data = new Date();
        Instant instante = data.toInstant();

        System.out.println(data);
        System.out.println(instante);
    }
}

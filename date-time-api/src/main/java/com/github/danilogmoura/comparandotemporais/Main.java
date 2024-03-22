package com.github.danilogmoura.comparandotemporais;

import java.time.LocalDate;
import java.time.chrono.ThaiBuddhistDate;

public class Main {

    public static void main(String[] args) {
        LocalDate hoje1 = LocalDate.now();
        LocalDate hoje2 = LocalDate.now();
        ThaiBuddhistDate hojeThau = ThaiBuddhistDate.now();
//        System.out.println(hojeThau);

        LocalDate depoisDeAmanha = LocalDate.now().plusDays(2);
//        System.out.println(hoje1.isEqual(hojeThau));
//        System.out.println(depoisDeAmanha.compareTo(hoje1) > 1);
        System.out.println(depoisDeAmanha.isAfter(hoje1));
        System.out.println(depoisDeAmanha.isBefore(hoje1));
    }
}

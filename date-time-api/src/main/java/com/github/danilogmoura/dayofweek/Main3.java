package com.github.danilogmoura.dayofweek;

import java.time.Year;

public class Main3 {

    public static void main(String[] args) {

        Year ano = Year.parse("2023");
//        Year anoFuturo = ano.plus(Period.parse("P10Y"));
//        Year anoFuturo = ano.plus(10, ChronoUnit.CENTURIES);
        Year anoFuturo = ano.plusYears(10);


        System.out.println(ano);
        System.out.println(anoFuturo);
    }
}

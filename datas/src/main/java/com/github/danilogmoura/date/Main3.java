package com.github.danilogmoura.date;

import java.util.Date;

public class Main3 {
    public static void main(String[] args) {

        Date hoje = new Date();
        Date ontem = new Date(System.currentTimeMillis() - (24 * 60 * 60 * 1000));

        long diferencaMillis = hoje.getTime() - ontem.getTime();
        System.out.println(diferencaMillis);

        double diferencaHora = diferencaMillis / 1000 / 60 / 60;

        System.out.printf("Diferençá em horas: %.2f%n", diferencaHora);

        System.out.printf("Depois: %b%n", hoje.after(ontem));
        System.out.printf("Depois: %b%n", hoje.before(ontem));


        System.out.printf("Comparação: %d%n", hoje.compareTo(ontem));
    }
}
package com.github.danilogmoura.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date hoje = new Date();


//        DateFormat formatador = DateFormat.getDateInstance();
//        DateFormat formatador = DateFormat.getDateTimeInstance();
//        DateFormat formatador = DateFormat.getTimeInstance();
//        DateFormat formatador = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.of("pt", "BR"));


        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSSS");

        System.out.println(formatador.format(hoje));
    }
}

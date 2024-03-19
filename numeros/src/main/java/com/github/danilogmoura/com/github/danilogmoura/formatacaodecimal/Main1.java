package com.github.danilogmoura.com.github.danilogmoura.formatacaodecimal;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Main1 {

    public static void main(String[] args) {
//        Locale.setDefault(new Locale("pt", "BR"));

        double a = 4_142_298.4288;
        float b = 0.3f;
        int c = 1;
        BigDecimal d = new BigDecimal("45.362");

//        DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("pt", "BR"));
//        NumberFormat formatador = new DecimalFormat("¤ #,##0.00;(¤ #,##0.00)", symbols);

        NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

//        formatador.setRoundingMode(RoundingMode.DOWN);
//        NumberFormat formatador = NumberFormat.getCurrencyInstance();

        System.out.println(formatador.format(a));
        System.out.println(formatador.format(b));
        System.out.println(formatador.format(c));
        System.out.println(formatador.format(d));
    }
}

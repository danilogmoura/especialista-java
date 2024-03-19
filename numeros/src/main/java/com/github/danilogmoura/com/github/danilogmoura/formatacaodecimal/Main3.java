package com.github.danilogmoura.com.github.danilogmoura.formatacaodecimal;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.Locale;

public class Main3 {

    public static void main(String[] args) throws ParseException {

        String texto = "1.000,43";

        DecimalFormat formatador = new DecimalFormat(
                "#,##0.00",
                new DecimalFormatSymbols(Locale.of("pt", "BR"))
        );

        formatador.setParseBigDecimal(true);

//        Number valor = formatador.parse(text);
//        double valor = formatador.parse(text).doubleValue();

        BigDecimal valor = (BigDecimal) formatador.parse(texto);
        valor = valor.add(new BigDecimal("1000"));


        System.out.println(valor.getClass());
        System.out.println(valor);
    }
}

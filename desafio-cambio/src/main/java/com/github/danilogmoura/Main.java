package com.github.danilogmoura;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.Scanner;

public class Main {

    private static final DecimalFormat FORMATADOR = new DecimalFormat();
    private static final Scanner SCANNER = new Scanner(System.in);

    static {
        FORMATADOR.setParseBigDecimal(true);
    }

    public static void main(String[] args) {
        System.out.print("Preço do produto em Dólares: ");
        BigDecimal valorEmDollar = scannerNextLine(CambioLocate.US);

        System.out.print("Preço de 1 Dólar em Real: ");
        BigDecimal cotacaoDollarEmReal = scannerNextLine(CambioLocate.PT_BR);

        BigDecimal valorConvertido = valorEmDollar.multiply(cotacaoDollarEmReal);
        System.out.printf("Preço do produto em Reais: %s%n",
                parseToString(valorConvertido, CambioLocate.PT_BR));
    }

    private static BigDecimal scannerNextLine(CambioLocate cambioLocate) {
        FORMATADOR.applyPattern(CurrenceParttern.DEFAULT.getParttern());
        while (true) {
            try {
                String valor = SCANNER.nextLine();
                return parseToBigDecimal(valor, cambioLocate);
            } catch (ParseException ignore) {
                System.out.print("Entre com uma valor válido: ");
            }
        }
    }

    private static BigDecimal parseToBigDecimal(String valor, CambioLocate cambioLocate) throws ParseException {
        FORMATADOR.setDecimalFormatSymbols(new DecimalFormatSymbols(cambioLocate.locale()));
        return (BigDecimal) FORMATADOR.parse(valor);
    }

    private static String parseToString(BigDecimal valor, CambioLocate cambioLocate) {
        FORMATADOR.applyPattern(CurrenceParttern.WITH_MONETARY_SYMBOL.getParttern());
        FORMATADOR.setDecimalFormatSymbols(new DecimalFormatSymbols(cambioLocate.locale()));
        return FORMATADOR.format(valor);

    }
}
package com.github.danilogmoura.desafio;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Main {

    private final static Scanner SCANNER = new Scanner(System.in);
    private final static DateFormat FORMATADOR = new SimpleDateFormat("dd/MM/yyyy");


    public static void main(String[] args) throws ParseException {
        System.out.print("Data da primeira parcela: ");
        String dataParcelaTexto = SCANNER.nextLine();

        Date dataParcela = FORMATADOR.parse(dataParcelaTexto);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataParcela);

        System.out.print("Quantidade de parcelas: ");
        int quantidadeParcelas = SCANNER.nextInt();

        imprimeParcelas(calendar, quantidadeParcelas);
    }

    private static void imprimeParcelas(Calendar dataParcela, int quantidadeParcelas) {
        int diaDaParcela = dataParcela.get(Calendar.DAY_OF_MONTH);

        for (int i = 1; i <= quantidadeParcelas; i++) {
            int ultimoDiaDoMes = dataParcela.getActualMaximum(Calendar.DAY_OF_MONTH);
            printLine(dataParcela, Math.min(diaDaParcela, ultimoDiaDoMes), i);
            dataParcela.add(Calendar.MONTH, 1);
        }
    }

    private static void printLine(Calendar dataParcela, int diaDaParcela, int i) {
        dataParcela.set(Calendar.DAY_OF_MONTH, diaDaParcela);
        System.out.printf("Parcela #%d - %s%n", i, FORMATADOR.format(dataParcela.getTime()));
    }
}

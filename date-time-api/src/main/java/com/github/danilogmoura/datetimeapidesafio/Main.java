package com.github.danilogmoura.datetimeapidesafio;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Data da primeira parcela: ");
        var dataPrimeiraParcela = SCANNER.nextLine();

        System.out.print("Quantidade de parcelas: ");
        var quantidadeDeParcelas = SCANNER.nextInt();

        var calcularParcelas = new CalcularParcelas(dataPrimeiraParcela, quantidadeDeParcelas);
        imprimiParcelas(calcularParcelas.calcular());
    }


    private static void imprimiParcelas(List<LocalDate> parcelas) {
        for (int i = 0; i < parcelas.size(); i++) {
            System.out.printf("Parcela #%02d - %s%n", (i + 1), parcelas.get(i).format(CalcularParcelas.DATE_PATTERN));
        }
    }
}

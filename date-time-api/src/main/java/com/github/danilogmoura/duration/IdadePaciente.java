package com.github.danilogmoura.duration;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class IdadePaciente {

    public static final DateTimeFormatter DATE_PTBR_PATTERN = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        var dataNscimento = getDataNscimento();
        var hoje = LocalDate.now();

        var tempoDeVida = Period.between(dataNscimento, hoje);

        System.out.printf("Paciente tem %s de vida%n", formatarPeriodo(tempoDeVida));
    }

    private static String formatarPeriodo(Period tempoDeVida) {
        return String.format("%d ano%s, %d %s e %d dia%s",
                tempoDeVida.getYears(), tempoDeVida.getYears() > 1 ? "s" : "",
                tempoDeVida.getMonths(), tempoDeVida.getMonths() > 1 ? "meses" : "mês",
                tempoDeVida.getDays(), tempoDeVida.getDays() > 1 ? "s" : "");
    }

    private static LocalDate getDataNscimento() {
        while (true) {
            try {
                System.out.print("Data de nascimento: ");
                var line = SCANNER.nextLine();
                return LocalDate.parse(line, DATE_PTBR_PATTERN);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Tente novamente");
            }
        }
    }
}

package com.github.danilogmoura.desafiolocaldatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class AgendamentoEvento {

    public static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static final String TIME_PATTERN = "HH:mm";
    public static final Locale PT_BR_LOCALE = Locale.of("pt", "BR");
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final DateTimeFormatter BRAZIL_FORMATTER = DateTimeFormatter
                                                                      .ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT)
                                                                      .withLocale(PT_BR_LOCALE);

    public static void main(String[] args) {

        LocalDate eventData = getEventData();
        LocalTime eventTime = getEventTime();
        LocalDateTime evertDateTime = LocalDateTime.of(eventData, eventTime);
        System.out.printf("Evento agendado para %s%n", evertDateTime.format(BRAZIL_FORMATTER));
    }

    private static LocalDate getEventData() {
        while (true) {
            try {
                System.out.print("Data do evento: ");
                var line = SCANNER.nextLine();
                return LocalDate.parse(line, DATE_PATTERN);
            } catch (Exception e) {
                System.out.println("Data inválida. Tente novamente");
            }
        }
    }

    private static LocalTime getEventTime() {
        while (true) {
            try {
                System.out.print("Horário do evento: ");
                var line = SCANNER.nextLine();
                return LocalTime.parse(line, DateTimeFormatter.ofPattern(TIME_PATTERN));
            } catch (Exception e) {
                System.out.println("Horário inválida. Tente novamente");
            }
        }
    }
}

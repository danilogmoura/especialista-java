package com.github.danilogmoura.DesafioTrabalhandoComFuso;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ConviteFesta {

    private static final DateTimeFormatter DATE_SYSTEM_IN_PATTERN = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter DATE_TIME_OUT_SYSTEM_PATTERN = DateTimeFormatter
                                                                                  .ofPattern("dd 'de' MMMM 'de' yyyy 'às' HH:mm (zzzz)")
                                                                                  .withLocale(Locale.of("pt", "BR"));

    private static final List<String> ZONE_IDS = List.of("America/Sao_Paulo", "America/Los_Angeles", "Japan");

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        LocalDate dataLocalDaFesta = getDataLocalDaFesta();
        LocalTime horaLocalDaFesta = getHoraLocalDaFesta();

        OffsetDateTime dataHoraLocalDaFesta = dataLocalDaFesta
                                                      .atTime(horaLocalDaFesta)
                                                      .atZone(ZoneId.systemDefault())
                                                      .toOffsetDateTime();

        for (String zoneId : ZONE_IDS) {
            System.out.println(dataHoraLocalDaFesta
                                       .atZoneSameInstant(ZoneId.of(zoneId))
                                       .format(DATE_TIME_OUT_SYSTEM_PATTERN));
        }
    }

    private static LocalDate getDataLocalDaFesta() {
        while (true) {
            try {
                System.out.print("Data local da festa: ");
                var line = SCANNER.nextLine();
                return LocalDate.parse(line, DATE_SYSTEM_IN_PATTERN);
            } catch (Exception e) {
                System.out.println("Data inválida. Tente novamente");
            }
        }
    }

    private static LocalTime getHoraLocalDaFesta() {
        while (true) {
            try {
                System.out.print("Horário local da festa: ");
                var line = SCANNER.nextLine();
                return LocalTime.parse(line);
            } catch (Exception e) {
                System.out.println("Horário inválida. Tente novamente");
            }
        }
    }
}

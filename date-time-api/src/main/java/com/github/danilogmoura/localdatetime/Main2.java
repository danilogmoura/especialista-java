package com.github.danilogmoura.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main2 {
    public static void main(String[] args) {
        LocalDate data = LocalDate.of(1981, 9, 13);
        LocalTime hora = LocalTime.of(23, 54, 10);

//        LocalDateTime dataHora = LocalDateTime.of(data, hora);
//        LocalDateTime dataHora = data.atTime(hora);
        LocalDateTime dataHora = hora.atDate(data);

        System.out.println(dataHora);
    }
}

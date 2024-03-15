package com.github.danilogmoura.temp;

public class CalculadoraTempo {

//    public static final int SEGUNDOS_POR_MINUTO = 60;
//    public static final int SEGUNDOS_POR_HORA = 3600;

    public static double converterSegundosEmHoras(int segundos) {
        return (double) segundos / TempoConstants.SEGUNDOS_POR_HORA;
    }

    public static double converterSegundosEmMinutos(int segundo) {
        return (double) segundo / TempoConstants.SEGUNDOS_POR_MINUTO;
    }
}

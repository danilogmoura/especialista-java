package com.github.danilogmoura.financeira.modelo;

public interface ClienteFinanciavel {

    double JUROS_BAIXO_RISCO = 1.0;
    double JUROS_MEDIO_RISCO = 1.5;
    double JUROS_ALTO_RISCO = 2.0;

    double calcularLimiteAprovado();

    default double calcularJuros(double valorSolicitado) {
        if (isFinanciamentoPequenoValor(valorSolicitado)) {
            return JUROS_BAIXO_RISCO;
        } else if (isFinanciamentoMedioValor(valorSolicitado)) {
            return JUROS_MEDIO_RISCO;
        }
        return JUROS_ALTO_RISCO;
    }

    private static boolean isFinanciamentoMedioValor(double valorSolicitado) {
        return valorSolicitado <= 1_000_000;
    }

    private static boolean isFinanciamentoPequenoValor(double valorSolicitado) {
        return valorSolicitado <= 100_000;
    }
}

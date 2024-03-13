package com.github.danilogmoura.financeira.modelo;

public class Industria extends Empresa implements ClienteFinanciavel {

    public static final double PERCENTUAL_FATURAMENTO_LIMITE_CREDITO = 0.5;
    public static final double TAXA_ACRESCIMO_LIMITE_INDISTRIA_SUSTENTAVEL = 1.2;

    private final boolean compensaEmissaCo2;

    public Industria(String razaoSocial, double totalFaturamento, boolean compensaEmissaCo2) {
        super(razaoSocial, totalFaturamento);
        this.compensaEmissaCo2 = compensaEmissaCo2;
    }

    @Override
    public double calcularLimiteAprovado() {
        var valorAprovado = getTotalFaturamento() * PERCENTUAL_FATURAMENTO_LIMITE_CREDITO;

        if (compensaEmissaCo2) {
            valorAprovado *= TAXA_ACRESCIMO_LIMITE_INDISTRIA_SUSTENTAVEL;
        }
        return valorAprovado;
    }
}

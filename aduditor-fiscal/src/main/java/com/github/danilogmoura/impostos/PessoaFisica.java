package com.github.danilogmoura.impostos;

public class PessoaFisica extends Pessoa {

    public static final double RECEITA_ANUAL_ISECAO = 5_000;
    public static final double ALIQUOTA_IMPOSTO_RENDA = 0.20;

    private final double receitaAnual;

    public PessoaFisica(String nome, double receitaAnual) {
        super(nome);
        if (receitaAnual < 0) {
            throw new IllegalArgumentException("Receita anual deve ser maior que ZERO");
        }

        this.receitaAnual = receitaAnual;
    }

    public double getReceitaAnual() {
        return receitaAnual;
    }

    @Override
    public double calcularImpostos() {
        var imposto = 0.0;

        if (receitaAnual > RECEITA_ANUAL_ISECAO) {
            imposto = getReceitaAnual() * ALIQUOTA_IMPOSTO_RENDA;
        }

        return imposto;
    }
}

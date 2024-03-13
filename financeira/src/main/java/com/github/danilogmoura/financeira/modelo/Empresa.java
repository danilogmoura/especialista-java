package com.github.danilogmoura.financeira.modelo;

public abstract class Empresa {

    private final String razaoSocial;
    private final double totalFaturamento;

    protected Empresa(String razaoSocial, double totalFaturamento) {
        this.razaoSocial = razaoSocial;
        this.totalFaturamento = totalFaturamento;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public double getTotalFaturamento() {
        return totalFaturamento;
    }
}

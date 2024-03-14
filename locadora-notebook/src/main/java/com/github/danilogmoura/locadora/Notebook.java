package com.github.danilogmoura.locadora;

public class Notebook {

    private final String descricao;
    private final double precoPorHora;
    private final double precoPorDia;

    public Notebook(String descricao, double precoPorHora, double precoPorDia) {
        this.descricao = descricao;
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrecoPorHora() {
        return precoPorHora;
    }

    public double getPrecoPorDia() {
        return precoPorDia;
    }
}

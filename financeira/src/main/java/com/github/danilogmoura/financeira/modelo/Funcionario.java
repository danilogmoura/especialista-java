package com.github.danilogmoura.financeira.modelo;

public class Funcionario implements ClienteFinanciavel {

    public static final int QUANTIDADE_SALARIOS_LIMITE_CREDITO = 5;

    private final String nome;
    private final double salarioMensal;

    public Funcionario(String nome, double salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    @Override
    public double calcularLimiteAprovado() {
        return getSalarioMensal() * QUANTIDADE_SALARIOS_LIMITE_CREDITO;
    }
}

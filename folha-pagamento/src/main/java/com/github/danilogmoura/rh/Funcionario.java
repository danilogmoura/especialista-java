package com.github.danilogmoura.rh;

import java.util.Objects;

public class Funcionario {

    private String nome;
    private double varlorHora;

    public Funcionario(String nome, double varlorHora) {
        this.setNome(nome);
        this.setVarlorHora(varlorHora);
    }

    public final String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        Objects.requireNonNull(nome);
        this.nome = nome;
    }

    public final double getVarlorHora() {
        return varlorHora;
    }

    public final void setVarlorHora(double varlorHora) {
        if (varlorHora <= 0) {
            throw new IllegalArgumentException("O valorHora deve ser maior que zero.");
        }
        this.varlorHora = varlorHora;
    }

    protected double calcularSalario(int horasTrabalhadas) {
        return varlorHora * horasTrabalhadas;
    }

    public Holerite gerarHolerite(int horasTrabalhadas, String mesAno) {
        final var valorSalario = calcularSalario(horasTrabalhadas);
        return new Holerite(this.nome, mesAno, valorSalario);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", varlorHora=" + varlorHora +
                '}';
    }
}

package com.github.danilogmoura.rh;

public class Programador extends Funcionario {

    private double valorBonus;

    public Programador(String nome, double varlorHora) {
        super(nome, varlorHora);
    }

    public final double getValorBonus() {
        return valorBonus;
    }

    public final void setValorBonus(double valorBonus) {
        if (valorBonus < 0) {
            throw new IllegalArgumentException("O valorBonus não deve ser negativo");
        }
        this.valorBonus = valorBonus;
    }

    @Override
    protected final double calcularSalario(int horasTrabalhadas) {
        return super.calcularSalario(horasTrabalhadas) + this.getValorBonus();
    }

    @Override
    public String toString() {
        return "Programador{" + "valorBonus=" + valorBonus + "} " + super.toString();
    }
}

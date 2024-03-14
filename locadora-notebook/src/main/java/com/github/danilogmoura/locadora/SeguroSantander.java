package com.github.danilogmoura.locadora;

public class SeguroSantander implements Seguro {
    @Override
    public double calcularPremio(int horasUtilizadas, double valorContrato) {
        return (horasUtilizadas * 0.5) + (valorContrato * 0.05);
    }
}

package com.github.danilogmoura.locadora;

public class SeguroItau implements Seguro {
    @Override
    public double calcularPremio(int horasUtilizadas, double valorContrato) {
        double dias = Math.ceil(horasUtilizadas / 24d);
        return valorContrato * dias;
    }
}

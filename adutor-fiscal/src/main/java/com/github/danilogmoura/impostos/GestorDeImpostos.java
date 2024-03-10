package com.github.danilogmoura.impostos;

import java.util.Objects;

public class GestorDeImpostos {

    private double valorTotalImpostos;


    public void adicionar(Pessoa pessoa) {
        Objects.requireNonNull(pessoa);

        double valorImpostosCalculados = pessoa.calcularImpostos();
        System.out.printf("Impostos devidos de %s: %.2f%n", pessoa.getNome(), valorImpostosCalculados);
        valorTotalImpostos += valorImpostosCalculados;
    }

    public double getValorTotalImpostos() {
        return valorTotalImpostos;
    }
}

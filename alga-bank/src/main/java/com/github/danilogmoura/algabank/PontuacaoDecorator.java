package com.github.danilogmoura.algabank;

import com.github.danilogmoura.javabank.Conta;

public class PontuacaoDecorator extends ContaBaseDecorator {

    private double pontos;

    public PontuacaoDecorator(Conta contaOriginal) {
        super(contaOriginal);
    }

    public double getPontos() {
        return pontos;
    }

    @Override
    public void depositar(double valor) {
        getContaOriginal().depositar(valor);
        pontos += valor / 100;
    }
}

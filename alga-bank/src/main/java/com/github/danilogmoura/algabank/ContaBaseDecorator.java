package com.github.danilogmoura.algabank;

import com.github.danilogmoura.javabank.Conta;

import java.util.Objects;

public abstract class ContaBaseDecorator implements Conta {

    private final Conta contaOriginal;

    public ContaBaseDecorator(Conta contaOriginal) {
        Objects.requireNonNull(contaOriginal);
        this.contaOriginal = contaOriginal;
    }

    public Conta getContaOriginal() {
        return contaOriginal;
    }

    @Override
    public double getSaldo() {
        return contaOriginal.getSaldo();
    }

    @Override
    public void sacar(double valor) {
        contaOriginal.sacar(valor);
    }

    @Override
    public void depositar(double valor) {
        contaOriginal.depositar(valor);
    }

    @Override
    public void transferir(Conta conta, double valor) {
        contaOriginal.transferir(conta, valor);
    }

    @Override
    public void aplicarEmInvestimento(double valor) {
        contaOriginal.aplicarEmInvestimento(valor);
    }

    @Override
    public void imprimirSaldo() {
        contaOriginal.imprimirSaldo();
    }
}

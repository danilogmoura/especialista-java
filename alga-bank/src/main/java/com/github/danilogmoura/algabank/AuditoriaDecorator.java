package com.github.danilogmoura.algabank;

import com.github.danilogmoura.javabank.Conta;

public class AuditoriaDecorator extends ContaBaseDecorator {

    private int quantidadeOperacoes;

    public AuditoriaDecorator(Conta contaOriginal) {
        super(contaOriginal);
    }

    public int getQuantidadeOperacoes() {
        return quantidadeOperacoes;
    }

    @Override
    public Conta getContaOriginal() {
        quantidadeOperacoes++;
        return super.getContaOriginal();
    }

    @Override
    public void sacar(double valor) {
        quantidadeOperacoes++;
        super.sacar(valor);
    }

    @Override
    public void depositar(double valor) {
        quantidadeOperacoes++;
        super.depositar(valor);
    }

    @Override
    public void transferir(Conta conta, double valor) {
        quantidadeOperacoes++;
        super.transferir(conta, valor);
    }

    @Override
    public void aplicarEmInvestimento(double valor) {
        quantidadeOperacoes++;
        super.aplicarEmInvestimento(valor);
    }

    @Override
    public void imprimirSaldo() {
        quantidadeOperacoes++;
        super.imprimirSaldo();
    }
}

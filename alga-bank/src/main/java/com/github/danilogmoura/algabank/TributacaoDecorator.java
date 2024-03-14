package com.github.danilogmoura.algabank;

import com.github.danilogmoura.javabank.Conta;

public class TributacaoDecorator extends ContaBaseDecorator {

    public static final double TAXA_IMPOSTO_MOVIMENTACAO = 0.1;


    public TributacaoDecorator(Conta contaOriginal) {
        super(contaOriginal);
    }

    @Override
    public void sacar(double valor) {
        getContaOriginal().sacar(valor);
        debitarImportoMovimentacao(valor);
    }

    @Override
    public void transferir(Conta conta, double valor) {
        getContaOriginal().transferir(conta, valor);
        debitarImportoMovimentacao(valor);
    }

    @Override
    public void aplicarEmInvestimento(double valor) {
        getContaOriginal().aplicarEmInvestimento(valor);
        debitarImportoMovimentacao(valor);
    }

    private void debitarImportoMovimentacao(double valorMovimentacao) {
        getContaOriginal().sacar(valorMovimentacao * TAXA_IMPOSTO_MOVIMENTACAO);
    }
}

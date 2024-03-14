package com.github.danilogmoura.algabank;

import com.github.danilogmoura.javabank.ContaCorrente;

public class ContaCorrenteComTributacao extends ContaCorrente {

    public static final double TAXA_IMPOSTO_MOVIMENTACAO = 0.1;

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
//        super.sacar(valor * TAXA_IMPOSTO_MOVIMENTACAO);
        sacarTarifa(valor);
    }

//    @Override
//    public void transferir(Conta conta, double valor) {
//        super.transferir(conta, valor);
//        super.sacar(valor * TAXA_IMPOSTO_MOVIMENTACAO);
//    }


    @Override
    public void aplicarEmInvestimento(double valor) {
        super.aplicarEmInvestimento(valor);
//        super.sacar(valor * TAXA_IMPOSTO_MOVIMENTACAO);
        sacarTarifa(valor);
    }

    public void sacarTarifa(double valorMovimentacao) {
        super.sacar(valorMovimentacao * TAXA_IMPOSTO_MOVIMENTACAO);
    }
}

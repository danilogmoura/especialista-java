package com.github.danilogmoura.naoEstatica.exemplo2Shadowing;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente(new BigDecimal("1000"));
        System.out.println(conta.getSaldo());

        conta.new Transacao("Compra no mercado", new BigDecimal("180.9"));
        conta.new Transacao("Academia", new BigDecimal("170"));

        System.out.println(conta.getSaldo());

        for (ContaCorrente.Transacao transacao : conta.getTransacoes()) {
            System.out.printf("%s = %s%n", transacao.getDescricao(), transacao.getValor());
        }

        System.out.println(conta.getSaldo());
    }
}

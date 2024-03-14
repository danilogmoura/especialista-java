package com.github.danilogmoura.algabank;

import com.github.danilogmoura.javabank.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        var conta1 = new ContaCorrenteComTributacao();
        var conta2 = new ContaCorrente();

        conta1.depositar(1_000);
//        conta1.sacar(100);
        conta1.transferir(conta2, 100);
//        conta1.aplicarEmInvestimento(100);

        System.out.printf("Saldo da conta 1: R$%.2f%n", conta1.getSaldo());
        System.out.printf("Saldo da conta 2: R$%.2f%n", conta2.getSaldo());
    }
}
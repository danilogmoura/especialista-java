package com.github.danilogmoura;

import com.github.danilogmoura.banco.ContaCorrente;

public class Main2 {
    public static void main(String[] args) {
        var conta1 = new ContaCorrente("123");
        var conta2 = new ContaCorrente("987");

        conta1.ativar();

        conta1.depositar(1_000);
        conta1.transferir(conta2, 500);

        System.out.printf("Saldo da conta 1: %.2f%n", conta1.getSaldo());
        System.out.printf("Saldo da conta 2: %.2f%n", conta1.getSaldo());

    }
}

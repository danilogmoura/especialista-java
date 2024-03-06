package com.github.danilogmoura;

import com.github.danilogmoura.banco.Conta;
import com.github.danilogmoura.banco.Titular;

public class PrincipalContaNormal {

    public static void main(String[] args) {
        var titular = new Titular("João da Silva", "12234523");

        var conta = new Conta(titular, 1234, 99999);
        conta.imprimirDemonstrativo();

        conta.depositar(100);
        conta.imprimirDemonstrativo();

        conta.sacar(27.50);
        conta.imprimirDemonstrativo();
    }
}

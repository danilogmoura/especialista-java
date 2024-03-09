package com.github.danilogmoura;

import com.github.danilogmoura.banco.Conta;
import com.github.danilogmoura.banco.ContaEspecial;
import com.github.danilogmoura.banco.Titular;

public class Principal1 {

    public static void main(String[] args) {
        var titular = new Titular("João da Silva", "12234523");
        var contaEspecial = new ContaEspecial(titular, 1234, 999999, 90);
        contaEspecial.setLimiteChequeEspecial(1000);
        contaEspecial.depositar(100);

        Conta conta = contaEspecial;

        System.out.println(contaEspecial.getClass().getName());
        System.out.println(conta.getClass().getName());

        System.out.println(conta == contaEspecial);
    }
}

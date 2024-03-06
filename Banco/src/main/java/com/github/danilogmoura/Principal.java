package com.github.danilogmoura;

import com.github.danilogmoura.banco.Conta;
import com.github.danilogmoura.banco.Titular;

public class Principal {

    public static void main(String[] args) {
        var titular = new Titular("João da Silva", "12234523");
        var conta1 = new Conta(titular, 1234, 999999);
        var conta2 = conta1;

        System.out.println(conta1 == conta2);

        var conta3 = new Conta(titular, 1234, 999999);

        System.out.println(conta1 == conta3);

        System.out.println(conta1.equals(conta3));
    }
}

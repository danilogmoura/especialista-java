package com.github.danilogmoura;

import com.github.danilogmoura.banco.Conta;
import com.github.danilogmoura.banco.ContaSalario;
import com.github.danilogmoura.banco.Titular;

public class Principal2 {

    public static void main(String[] args) {
        var titular = new Titular("João da Silva", "12234523");
        Conta conta = new ContaSalario(titular, 1234, 999999, 18000.0);
    }
}

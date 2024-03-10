package com.github.danilogmoura;

import com.github.danilogmoura.banco.*;

public class Principal3 {

    public static void main(String[] args) {
        var caixaEletronico = new CaixaEletronico();

        var conta1 = new ContaEspecial(new Titular("João da Silva", "12234523"),
                1234, 999999, 90);
        conta1.setLimiteChequeEspecial(1000);

        var conta2 = new ContaInvestimento(new Titular("José da Silva", "52234523"),
                1234, 888888);
        conta2.depositar(100);
        conta2.creditarRendimento(10);

        var conta3 = new ContaSalario(new Titular("Joel da Silva", "32234523"),
                1234, 777777, 18_000);
        conta3.depositar(100);

        caixaEletronico.imprimirDemonstrativo(conta3);
    }
}

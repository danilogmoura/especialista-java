package com.github.danilogmoura;

import com.github.danilogmoura.banco.CaixaEletronico;
import com.github.danilogmoura.banco.ContaEspecial;
import com.github.danilogmoura.banco.ContaSalario;
import com.github.danilogmoura.banco.Titular;

public class Principal2 {

    public static void main(String[] args) {
        var conta1 = new ContaEspecial(new Titular("João da Silva", "12234523")
                , 1234, 999999, 90);
        conta1.setLimiteChequeEspecial(1000);
        conta1.depositar(300);

        var conta2 = new ContaEspecial(new Titular("João da Silva", "23134523")
                , 1234, 777777, 90);

        var conta3 = new ContaSalario(new Titular("Francisco Souza", "78334123")
                , 1234, 888888, 18_000);

        var caixaEletronico = new CaixaEletronico();
        caixaEletronico.transferir(conta1, conta3, 50);
        conta1.imprimirDemonstrativo();
        conta3.imprimirDemonstrativo();
    }
}

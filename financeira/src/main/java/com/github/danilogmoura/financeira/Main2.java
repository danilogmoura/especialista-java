package com.github.danilogmoura.financeira;

import com.github.danilogmoura.financeira.modelo.Funcionario;
import com.github.danilogmoura.financeira.modelo.PessoaBonificavel;
import com.github.danilogmoura.financeira.servico.ServicoPagamentoBonus;

public class Main2 {

    public static void main(String[] args) {
        PessoaBonificavel funcionario = new Funcionario("João da Silva", 18_000);

        var servicoPagamentoBonus = new ServicoPagamentoBonus();
        servicoPagamentoBonus.pagar(funcionario, 80);
    }
}

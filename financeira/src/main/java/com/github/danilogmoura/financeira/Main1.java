package com.github.danilogmoura.financeira;

import com.github.danilogmoura.financeira.modelo.Fazenda;
import com.github.danilogmoura.financeira.modelo.Funcionario;
import com.github.danilogmoura.financeira.modelo.Industria;
import com.github.danilogmoura.financeira.servico.ServicoFinanciamento;

public class Main1 {

    public static void main(String[] args) {
        var servicoFinanciamento = new ServicoFinanciamento();
        var fazenda = new Fazenda("Fazenda Dona Benedita", 5_000_000, 5);
        var industria = new Industria("Alimentos da Vovó", 900_000, true);
        var funcionario = new Funcionario("João da Silva", 18_000);
        //var parceiro = new ParceiroFinanceiro("Capital ABC", 2_000_000);

        servicoFinanciamento.solicitarFinanciamento(funcionario, 90_000);
        servicoFinanciamento.solicitarFinanciamento(fazenda, 600_000);
        servicoFinanciamento.solicitarFinanciamento(industria, 500_000);

    }
}

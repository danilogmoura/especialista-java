package com.github.danilogmoura.financeira.servico;

import com.github.danilogmoura.financeira.modelo.ClienteFinanciavel;

public class ServicoFinanciamento {

    public void solicitarFinanciamento(ClienteFinanciavel cliente, double valorSolicitado) {
        var limiteAprovado = cliente.calcularLimiteAprovado();
        var jurosCalculado = cliente.calcularJuros(valorSolicitado);

        if (limiteAprovado < valorSolicitado) {
            throw new RuntimeException(String.format(
                    "Financiamento não aprovado. Limite máximo de %.2f", limiteAprovado));
        }

        // registraríamos a solicitação do financiamento aqui em alguma classe de persistência de dados,
        // mas por enquanto, apenas imagine isso acontecendo...

        System.out.printf("DEBUG: Financiamento aprovado no valor R$%.2f com juros de %.2f%%. Limite máximo de %.2f%n",
                valorSolicitado, jurosCalculado, limiteAprovado);
    }

    public double consultarLimiteAprovado(ClienteFinanciavel cliente) {
        // aqui poderia registrar a consulta em algum lugar para um consultor comercial então entrar em contato
        // com o cliente (não vamo fazer isso, porque o objetivo agora é estudar OO primeiro)

        return cliente.calcularLimiteAprovado();
    }

}

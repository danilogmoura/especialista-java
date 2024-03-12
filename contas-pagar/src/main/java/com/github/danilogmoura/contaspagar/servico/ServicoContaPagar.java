package com.github.danilogmoura.contaspagar.servico;

import com.github.danilogmoura.contaspagar.pagamento.DocumentoPagavel;
import com.github.danilogmoura.contaspagar.pagamento.MetodoPagamento;


public class ServicoContaPagar {

    private final MetodoPagamento metodoPagamento;

    public ServicoContaPagar(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar(DocumentoPagavel documentoPagavel) {

        // Poderia ter outras regras de negócio aqui
        // como por exemplo registrar o pagamento no banco de dados,
        // enviar uma notificação por e-mai, etc

        metodoPagamento.pagar(documentoPagavel);
    }
}

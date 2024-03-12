package com.github.danilogmoura;

import com.github.danilogmoura.contaspagar.modelo.Holerite;
import com.github.danilogmoura.contaspagar.modelo.OrdemServico;
import com.github.danilogmoura.contaspagar.pagamento.*;
import com.github.danilogmoura.contaspagar.servico.ServicoContaPagar;

public class Main {

    public static void main(String[] args) {

        MetodoPagamento metodoPagamento = new Pix();
        var servicoContaPagar = new ServicoContaPagar(metodoPagamento);

        var funcionaio = new Beneficiario("João da Silva", "19838283828", "5252151");
        DocumentoPagavel documentoPagavel = new Holerite(funcionaio, 100, 168);
        servicoContaPagar.pagar(documentoPagavel);

        metodoPagamento = new Transferencia();
        servicoContaPagar = new ServicoContaPagar(metodoPagamento);

        var beneficiario = new Beneficiario("Consultória xyz", "54315423415151", "31151");
        var ordemServico = new OrdemServico(beneficiario, 65_500);
        servicoContaPagar.pagar(ordemServico);
    }
}

package com.github.danilogmoura.Desafio;

import com.github.danilogmoura.Desafio.Comercial.ServicoDeVenda;
import com.github.danilogmoura.Desafio.Comercial.Venda;

import java.util.List;

public class Principal3 {

    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

        vendas.stream()
                .filter(Venda::isFechada)
                .flatMap(venda -> venda.getItens().stream())
                .map(Venda.Item::descricao)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
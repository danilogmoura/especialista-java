package com.github.danilogmoura.Desafio;

import com.github.danilogmoura.Desafio.Comercial.ServicoDeVenda;
import com.github.danilogmoura.Desafio.Comercial.Venda;

import java.math.BigDecimal;
import java.util.List;

public class Principal4 {

    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

        BigDecimal totalVendas = vendas.stream()
                                         .filter(Venda::isFechada)
                                         .map(Venda::getValorTotal)
                                         .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println(totalVendas);
    }
}
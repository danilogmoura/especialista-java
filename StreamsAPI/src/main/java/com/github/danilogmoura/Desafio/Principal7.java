package com.github.danilogmoura.Desafio;

import com.github.danilogmoura.Desafio.Comercial.ServicoDeVenda;
import com.github.danilogmoura.Desafio.Comercial.Venda;

import java.util.List;
import java.util.stream.Collectors;

public class Principal7 {

    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

        var vendasRealizadasPorCliente = vendas.stream()
                                                 .filter(Venda::isFechada)
                                                 .collect(Collectors.groupingBy(
                                                         venda -> venda.getCliente().nome(),
                                                         Collectors.counting()));
        System.out.println(vendasRealizadasPorCliente);
    }
}
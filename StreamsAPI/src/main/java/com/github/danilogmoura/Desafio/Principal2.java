package com.github.danilogmoura.Desafio;

import com.github.danilogmoura.Desafio.Comercial.Cliente;
import com.github.danilogmoura.Desafio.Comercial.ServicoDeVenda;
import com.github.danilogmoura.Desafio.Comercial.Venda;

import java.util.Comparator;
import java.util.List;

public class Principal2 {

    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

        vendas.stream()
                .filter(Venda::isFechada)
                .map(Venda::getCliente)
                .distinct()
                .sorted(Comparator.comparing(Cliente::nome))
                .forEach(System.out::println);
    }
}
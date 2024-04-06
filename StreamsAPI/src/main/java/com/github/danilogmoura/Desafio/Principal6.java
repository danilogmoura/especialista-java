package com.github.danilogmoura.Desafio;

import com.github.danilogmoura.Desafio.Comercial.Cliente;
import com.github.danilogmoura.Desafio.Comercial.ServicoDeVenda;
import com.github.danilogmoura.Desafio.Comercial.Venda;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toCollection;

public class Principal6 {

    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

        List<String> clientes = vendas.stream()
                                        .filter(Venda::isFechada)
                                        .map(Venda::getCliente)
                                        .map(Cliente::nome)
                                        .distinct()
                                        .sorted()
                                        .collect(toCollection(ArrayList::new));
        System.out.println(clientes);
    }
}
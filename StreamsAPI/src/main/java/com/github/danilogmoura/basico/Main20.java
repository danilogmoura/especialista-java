package com.github.danilogmoura.basico;

import com.github.danilogmoura.basico.estoque.CadastroProduto;
import com.github.danilogmoura.basico.estoque.Produto;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main20 {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        Map<String, Long> produtosPorFabricante = produtos.stream()
                                                          .filter(Produto::temEstoque)
                                                          .collect(Collectors.groupingBy(produto -> produto.getFabricante().nome(),
                                                                  Collectors.counting())
                                                          );
        System.out.println(produtosPorFabricante);

        Map<String, Integer> estoquePorFabricante = produtos.stream()
                                                            .filter(Produto::temEstoque)
                                                            .collect(Collectors.groupingBy(produto -> produto.getFabricante().nome(),
                                                                    Collectors.summingInt(Produto::getQuantidade))
                                                            );
        System.out.println(estoquePorFabricante);
    }
}

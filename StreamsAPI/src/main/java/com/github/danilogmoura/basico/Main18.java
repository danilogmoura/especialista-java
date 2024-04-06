package com.github.danilogmoura.basico;

import com.github.danilogmoura.basico.estoque.CadastroProduto;
import com.github.danilogmoura.basico.estoque.Produto;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main18 {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        Map<String, Integer> estoque = produtos.stream()
                                               .filter(Produto::temEstoque)
                                               .collect(Collectors.toMap(Produto::getNome, Produto::getQuantidade));
        System.out.println(estoque);
    }
}
